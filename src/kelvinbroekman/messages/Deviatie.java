package kelvinbroekman.messages;

import com.sun.tools.ws.wsdl.document.Fault;
import com.sun.xml.ws.developer.SchemaValidation;
import kelvinbroekman.applicatiefout.ApplicationError;
import kelvinbroekman.request.RequestInput;
import kelvinbroekman.response.ObjectFactory;
import kelvinbroekman.applicatiefout.*;
import kelvinbroekman.response.ResponseOutput;

import javax.jws.WebService;

/**
 * Created by Kelvin on 10-3-2017.
 */
@WebService(endpointInterface = "kelvinbroekman.messages.BerekenStandaardDeviatie")
@SchemaValidation(handler = kelvinbroekman.applicatiefout.ValidationHandler.class)
public class Deviatie implements BerekenStandaardDeviatie {

    @Override
    public ResponseOutput calculateDeviatie(RequestInput request) throws Inputfault {

        ObjectFactory factory = new ObjectFactory();
        ResponseOutput response = factory.createResponseOutput();

        try {
            double waarde = Berekening.Bereken(request);
            response.setUitkomst(waarde);
        }
        catch(RuntimeException e) {
            System.out.println(e.getMessage());

            kelvinbroekman.applicatiefout.ObjectFactory exception = new kelvinbroekman.applicatiefout.ObjectFactory();

            ApplicationError error = exception.createApplicationError();
            error.setErrorCode((short)1);
            error.setMessage("Kan de standaarddeviatie niet berekenen");

            Inputfault f = new Inputfault("Er ging iets mis", error);
            System.out.println("ERROR///////////////////////////////");
            throw f;
        }
        return response;
    }
}
