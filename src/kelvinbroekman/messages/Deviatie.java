package kelvinbroekman.messages;

import com.sun.tools.ws.wsdl.document.Fault;
import com.sun.xml.ws.developer.SchemaValidation;
import kelvinbroekman.fault.ValidationHandler;
import kelvinbroekman.request.RequestInput;
import kelvinbroekman.response.ObjectFactory;
import kelvinbroekman.response.ResponseOutput;

import javax.jws.WebService;

/**
 * Created by Kelvin on 10-3-2017.
 */
@WebService(endpointInterface = "kelvinbroekman.messages.BerekenStandaardDeviatie")
@SchemaValidation(handler = ValidationHandler.class)
public class Deviatie implements BerekenStandaardDeviatie {

    @Override
    public ResponseOutput calculateDeviatie(RequestInput request) throws Inputfault {

        ObjectFactory factory = new ObjectFactory();
        ResponseOutput response = factory.createResponseOutput();

        try {
            if(request.getNumber1() <= 0 || request.getNumber2() <= 0 ||
                    request.getNumber3() <= 0 || request.getNumber4() <= 0 || request.getNumber5() <= 0) {
                throw new RuntimeException();
            }

            double waarde = Berekening.Bereken(request);
            response.setUitkomst(waarde);
        }
        catch(RuntimeException e) {

            kelvinbroekman.fault.ObjectFactory fac = new kelvinbroekman.fault.ObjectFactory();
            kelvinbroekman.fault.Fault x = fac.createFault();

            x.setErrorCode((short)1);
            x.setMessage("Kan de standaarddeviatie niet berekenen, voer alleen getallen in groter dan 0");

            Inputfault f = new Inputfault("Er ging iets mis", x);
            throw f;
        }
        return response;
    }
}
