
package kelvinbroekman.request;

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
 *         &lt;element name="number1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="number2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="number3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="number4" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="number5" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "number1",
    "number2",
    "number3",
    "number4",
    "number5"
})
@XmlRootElement(name = "requestInput")
public class RequestInput {

    protected int number1;
    protected int number2;
    protected int number3;
    protected int number4;
    protected int number5;

    /**
     * Gets the value of the number1 property.
     * 
     */
    public int getNumber1() {
        return number1;
    }

    /**
     * Sets the value of the number1 property.
     * 
     */
    public void setNumber1(int value) {
        this.number1 = value;
    }

    /**
     * Gets the value of the number2 property.
     * 
     */
    public int getNumber2() {
        return number2;
    }

    /**
     * Sets the value of the number2 property.
     * 
     */
    public void setNumber2(int value) {
        this.number2 = value;
    }

    /**
     * Gets the value of the number3 property.
     * 
     */
    public int getNumber3() {
        return number3;
    }

    /**
     * Sets the value of the number3 property.
     * 
     */
    public void setNumber3(int value) {
        this.number3 = value;
    }

    /**
     * Gets the value of the number4 property.
     * 
     */
    public int getNumber4() {
        return number4;
    }

    /**
     * Sets the value of the number4 property.
     * 
     */
    public void setNumber4(int value) {
        this.number4 = value;
    }

    /**
     * Gets the value of the number5 property.
     * 
     */
    public int getNumber5() {
        return number5;
    }

    /**
     * Sets the value of the number5 property.
     * 
     */
    public void setNumber5(int value) {
        this.number5 = value;
    }

}
