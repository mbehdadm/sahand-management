
package com.sahand.management.proxy.service.administration;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userAdministrationRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userAdministrationRq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.administration.industrial.sahand.com/}requestBase">
 *       &lt;sequence>
 *         &lt;element name="branch" type="{http://service.administration.industrial.sahand.com/}branch" minOccurs="0"/>
 *         &lt;element name="branchEmployees" type="{http://service.administration.industrial.sahand.com/}branchEmployee" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="branchInventories" type="{http://service.administration.industrial.sahand.com/}branchInventory" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="exceptionDate" type="{http://service.administration.industrial.sahand.com/}systemActionExceptionDate" minOccurs="0"/>
 *         &lt;element name="max" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="systemAction" type="{http://service.administration.industrial.sahand.com/}systemAction" minOccurs="0"/>
 *         &lt;element name="uiComponents" type="{http://service.administration.industrial.sahand.com/}userInterfaceComponent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="user" type="{http://service.administration.industrial.sahand.com/}user" minOccurs="0"/>
 *         &lt;element name="userGroup" type="{http://service.administration.industrial.sahand.com/}userGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userAdministrationRq", propOrder = {
    "branch",
    "branchEmployees",
    "branchInventories",
    "exceptionDate",
    "max",
    "start",
    "systemAction",
    "uiComponents",
    "user",
    "userGroup"
})
public class UserAdministrationRq
    extends RequestBase
{

    protected Branch branch;
    @XmlElement(nillable = true)
    protected List<BranchEmployee> branchEmployees;
    @XmlElement(nillable = true)
    protected List<BranchInventory> branchInventories;
    protected SystemActionExceptionDate exceptionDate;
    protected Integer max;
    protected Integer start;
    protected SystemAction systemAction;
    @XmlElement(nillable = true)
    protected List<UserInterfaceComponent> uiComponents;
    protected User user;
    protected UserGroup userGroup;

    /**
     * Gets the value of the branch property.
     * 
     * @return
     *     possible object is
     *     {@link Branch }
     *     
     */
    public Branch getBranch() {
        return branch;
    }

    /**
     * Sets the value of the branch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Branch }
     *     
     */
    public void setBranch(Branch value) {
        this.branch = value;
    }

    /**
     * Gets the value of the branchEmployees property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the branchEmployees property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBranchEmployees().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BranchEmployee }
     * 
     * 
     */
    public List<BranchEmployee> getBranchEmployees() {
        if (branchEmployees == null) {
            branchEmployees = new ArrayList<BranchEmployee>();
        }
        return this.branchEmployees;
    }

    /**
     * Gets the value of the branchInventories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the branchInventories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBranchInventories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BranchInventory }
     * 
     * 
     */
    public List<BranchInventory> getBranchInventories() {
        if (branchInventories == null) {
            branchInventories = new ArrayList<BranchInventory>();
        }
        return this.branchInventories;
    }

    /**
     * Gets the value of the exceptionDate property.
     * 
     * @return
     *     possible object is
     *     {@link SystemActionExceptionDate }
     *     
     */
    public SystemActionExceptionDate getExceptionDate() {
        return exceptionDate;
    }

    /**
     * Sets the value of the exceptionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemActionExceptionDate }
     *     
     */
    public void setExceptionDate(SystemActionExceptionDate value) {
        this.exceptionDate = value;
    }

    /**
     * Gets the value of the max property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMax() {
        return max;
    }

    /**
     * Sets the value of the max property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMax(Integer value) {
        this.max = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStart(Integer value) {
        this.start = value;
    }

    /**
     * Gets the value of the systemAction property.
     * 
     * @return
     *     possible object is
     *     {@link SystemAction }
     *     
     */
    public SystemAction getSystemAction() {
        return systemAction;
    }

    /**
     * Sets the value of the systemAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemAction }
     *     
     */
    public void setSystemAction(SystemAction value) {
        this.systemAction = value;
    }

    /**
     * Gets the value of the uiComponents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uiComponents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUiComponents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserInterfaceComponent }
     * 
     * 
     */
    public List<UserInterfaceComponent> getUiComponents() {
        if (uiComponents == null) {
            uiComponents = new ArrayList<UserInterfaceComponent>();
        }
        return this.uiComponents;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUser(User value) {
        this.user = value;
    }

    /**
     * Gets the value of the userGroup property.
     * 
     * @return
     *     possible object is
     *     {@link UserGroup }
     *     
     */
    public UserGroup getUserGroup() {
        return userGroup;
    }

    /**
     * Sets the value of the userGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserGroup }
     *     
     */
    public void setUserGroup(UserGroup value) {
        this.userGroup = value;
    }

}
