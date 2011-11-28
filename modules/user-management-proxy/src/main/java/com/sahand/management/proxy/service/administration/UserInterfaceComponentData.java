
package com.sahand.management.proxy.service.administration;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userInterfaceComponentData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userInterfaceComponentData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="compDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="compLatinName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compType" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="userGroup" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userInterfaceComponentData", propOrder = {
    "compDesc",
    "compId",
    "compLatinName",
    "compName",
    "compType",
    "userGroup"
})
public class UserInterfaceComponentData {

    protected String compDesc;
    protected BigInteger compId;
    protected String compLatinName;
    protected String compName;
    protected BigInteger compType;
    protected BigInteger userGroup;

    /**
     * Gets the value of the compDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompDesc() {
        return compDesc;
    }

    /**
     * Sets the value of the compDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompDesc(String value) {
        this.compDesc = value;
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

    /**
     * Gets the value of the userGroup property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUserGroup() {
        return userGroup;
    }

    /**
     * Sets the value of the userGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUserGroup(BigInteger value) {
        this.userGroup = value;
    }

	@Override
	public String toString() {
		return "UserInterfaceComponentData [compDesc=" + compDesc + ", compId="
				+ compId + ", compLatinName=" + compLatinName + ", compName="
				+ compName + ", compType=" + compType + ", userGroup="
				+ userGroup + "]";
	}

}
