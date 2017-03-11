package kelvinbroekman.applicatiefout;

import com.sun.xml.ws.developer.ValidationErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

/**
 * Created by Kelvin on 11-3-2017.
 */
public class ValidationHandler extends ValidationErrorHandler {
    @Override
    public void warning(SAXParseException exception) throws SAXException {
        //store error in packet
        packet.invocationProperties.put("error", exception);
    }

    @Override
    public void error(SAXParseException exception) throws SAXException {
        throw exception;
    }

    @Override
    public void fatalError(SAXParseException exception) throws SAXException {

    }
}
