
package kelvinbroekman.request;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="number1" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="number2" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="number3" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="number4" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="number5" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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

    @XmlElement(required = true)
    protected BigInteger number1;
    @XmlElement(required = true)
    protected BigInteger number2;
    @XmlElement(required = true)
    protected BigInteger number3;
    @XmlElement(required = true)
    protected BigInteger number4;
    @XmlElement(required = true)
    protected BigInteger number5;

    /**
     * Gets the value of the number1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumber1() {
        return number1;
    }

    /**
     * Sets the value of the number1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumber1(BigInteger value) {
        this.number1 = value;
    }

    /**
     * Gets the value of the number2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumber2() {
        return number2;
    }

    /**
     * Sets the value of the number2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumber2(BigInteger value) {
        this.number2 = value;
    }

    /**
     * Gets the value of the number3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumber3() {
        return number3;
    }

    /**
     * Sets the value of the number3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumber3(BigInteger value) {
        this.number3 = value;
    }

    /**
     * Gets the value of the number4 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumber4() {
        return number4;
    }

    /**
     * Sets the value of the number4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumber4(BigInteger value) {
        this.number4 = value;
    }

    /**
     * Gets the value of the number5 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumber5() {
        return number5;
    }

    /**
     * Sets the value of the number5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumber5(BigInteger value) {
        this.number5 = value;
    }

}
