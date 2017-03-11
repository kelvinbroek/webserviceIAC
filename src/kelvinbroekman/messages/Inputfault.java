
package kelvinbroekman.messages;

import javax.xml.ws.WebFault;
import kelvinbroekman.applicatiefout.ApplicationError;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "ApplicationError", targetNamespace = "http://kelvinBroekman/applicatiefout")
public class Inputfault
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ApplicationError faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public Inputfault(String message, ApplicationError faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public Inputfault(String message, ApplicationError faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: kelvinbroekman.applicatiefout.ApplicationError
     */
    public ApplicationError getFaultInfo() {
        return faultInfo;
    }

}
