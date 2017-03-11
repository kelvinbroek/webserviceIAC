
package kelvinbroekman.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uitkomst" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "uitkomst"
})
@XmlRootElement(name = "responseOutput")
public class ResponseOutput {

    protected double uitkomst;

    /**
     * Gets the value of the uitkomst property.
     * 
     */
    public double getUitkomst() {
        return uitkomst;
    }

    /**
     * Sets the value of the uitkomst property.
     * 
     */
    public void setUitkomst(double value) {
        this.uitkomst = value;
    }

}
