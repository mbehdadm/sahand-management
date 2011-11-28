
package com.sahand.management.proxy.service.administration;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userInterfaceComponent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userInterfaceComponent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="compDec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="compLatinName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compType" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userInterfaceComponent", propOrder = {
    "compDec",
    "compId",
    "compLatinName",
    "compName",
    "compType"
})
public class UserInterfaceComponent {

    protected String compDec;
    protected BigInteger compId;
    protected String compLatinName;
    protected String compName;
    protected BigInteger compType;

    /**
     * Gets the value of the compDec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompDec() {
        return compDec;
    }

    /**
     * Sets the value of the compDec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompDec(String value) {
        this.compDec = value;
    }

    /**
     * Gets the value of the compId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCompId() {
        return compId;
    }

    /**
     * Sets the value of the compId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCompId(BigInteger value) {
        this.compId = value;
    }

    /**
     * Gets the value of the compLatinName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompLatinName() {
        return compLatinName;
    }

    /**
     * Sets the value of the compLatinName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompLatinName(String value) {
        this.compLatinName = value;
    }

    /**
     * Gets the value of the compName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompName() {
        return compName;
    }

    /**
     * Sets the value of the compName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompName(String value) {
        this.compName = value;
    }

    /**
     * Gets the value of the compType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCompType() {
        return compType;
    }

    /**
     * Sets the value of the compType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCompType(BigInteger value) {
        this.compType = value;
    }

	@Override
	public String toString() {
		return "UserInterfaceComponent [compDec=" + compDec + ", compId="
				+ compId + ", compLatinName=" + compLatinName + ", compName="
				+ compName + ", compType=" + compType + "]";
	}

}
