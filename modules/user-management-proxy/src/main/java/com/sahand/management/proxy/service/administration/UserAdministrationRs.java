
package com.sahand.management.proxy.service.administration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userAdministrationRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userAdministrationRs">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.administration.industrial.sahand.com/}responseBase">
 *       &lt;sequence>
 *         &lt;element name="branchEmployees" type="{http://service.administration.industrial.sahand.com/}branchEmployee" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="branchInventories" type="{http://service.administration.industrial.sahand.com/}branchInventory" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="branchs" type="{http://service.administration.industrial.sahand.com/}branch" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="exceptionDate" type="{http://service.administration.industrial.sahand.com/}systemActionExceptionDate" minOccurs="0"/>
 *         &lt;element name="exceptionDateList" type="{http://service.administration.industrial.sahand.com/}systemActionExceptionDate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="exceptionDateListFull" type="{http://service.administration.industrial.sahand.com/}systemActionExceptionDateFull" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="systemAcionList" type="{http://service.administration.industrial.sahand.com/}systemAction" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="systemAction" type="{http://service.administration.industrial.sahand.com/}systemAction" minOccurs="0"/>
 *         &lt;element name="totalRow" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="uiComponents" type="{http://service.administration.industrial.sahand.com/}userInterfaceComponent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="uiComponentsTree" type="{http://service.administration.industrial.sahand.com/}uiComponent2UIComponent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="user" type="{http://service.administration.industrial.sahand.com/}user" minOccurs="0"/>
 *         &lt;element name="userGroup" type="{http://service.administration.industrial.sahand.com/}userGroup" minOccurs="0"/>
 *         &lt;element name="userGroupList" type="{http://service.administration.industrial.sahand.com/}userGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="userInterfaceComponentDatas" type="{http://service.administration.industrial.sahand.com/}userInterfaceComponentData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="userList" type="{http://service.administration.industrial.sahand.com/}user" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userAdministrationRs", propOrder = {
    "branchEmployees",
    "branchInventories",
    "branchs",
    "exceptionDate",
    "exceptionDateLists",
    "exceptionDateListFulls",
    "systemAcionLists",
    "systemAction",
    "totalRow",
    "uiComponents",
    "uiComponentsTrees",
    "user",
    "userGroup",
    "userGroupLists",
    "userInterfaceComponentDatas",
    "userLists"
})
public class UserAdministrationRs
    extends ResponseBase
{

    @XmlElement(nillable = true)
    protected List<BranchEmployee> branchEmployees;
    @XmlElement(nillable = true)
    protected List<BranchInventory> branchInventories;
    @XmlElement(nillable = true)
    protected List<Branch> branchs;
    protected SystemActionExceptionDate exceptionDate;
    @XmlElement(name = "exceptionDateList", nillable = true)
    protected List<SystemActionExceptionDate> exceptionDateLists;
    @XmlElement(name = "exceptionDateListFull", nillable = true)
    protected List<SystemActionExceptionDateFull> exceptionDateListFulls;
    @XmlElement(name = "systemAcionList", nillable = true)
    protected List<SystemAction> systemAcionLists;
    protected SystemAction systemAction;
    protected Long totalRow;
    @XmlElement(nillable = true)
    protected List<UserInterfaceComponent> uiComponents;
    @XmlElement(name = "uiComponentsTree", nillable = true)
    protected List<UiComponent2UIComponent> uiComponentsTrees;
    protected User user;
    protected UserGroup userGroup;
    @XmlElement(name = "userGroupList", nillable = true)
    protected List<UserGroup> userGroupLists;
    @XmlElement(nillable = true)
    protected List<UserInterfaceComponentData> userInterfaceComponentDatas;
    @XmlElement(name = "userList", nillable = true)
    protected List<User> userLists;

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
     * Gets the value of the branchs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the branchs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBranchs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Branch }
     * 
     * 
     */
    public List<Branch> getBranchs() {
        if (branchs == null) {
            branchs = new ArrayList<Branch>();
        }
        return this.branchs;
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
     * Gets the value of the exceptionDateLists property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exceptionDateLists property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExceptionDateLists().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemActionExceptionDate }
     * 
     * 
     */
    public List<SystemActionExceptionDate> getExceptionDateLists() {
        if (exceptionDateLists == null) {
            exceptionDateLists = new ArrayList<SystemActionExceptionDate>();
        }
        return this.exceptionDateLists;
    }

    /**
     * Gets the value of the exceptionDateListFulls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exceptionDateListFulls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExceptionDateListFulls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemActionExceptionDateFull }
     * 
     * 
     */
    public List<SystemActionExceptionDateFull> getExceptionDateListFulls() {
        if (exceptionDateListFulls == null) {
            exceptionDateListFulls = new ArrayList<SystemActionExceptionDateFull>();
        }
        return this.exceptionDateListFulls;
    }

    /**
     * Gets the value of the systemAcionLists property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the systemAcionLists property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSystemAcionLists().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemAction }
     * 
     * 
     */
    public List<SystemAction> getSystemAcionLists() {
        if (systemAcionLists == null) {
            systemAcionLists = new ArrayList<SystemAction>();
        }
        return this.systemAcionLists;
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
     * Gets the value of the totalRow property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalRow() {
        return totalRow;
    }

    /**
     * Sets the value of the totalRow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalRow(Long value) {
        this.totalRow = value;
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
     * Gets the value of the uiComponentsTrees property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uiComponentsTrees property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUiComponentsTrees().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UiComponent2UIComponent }
     * 
     * 
     */
    public List<UiComponent2UIComponent> getUiComponentsTrees() {
        if (uiComponentsTrees == null) {
            uiComponentsTrees = new ArrayList<UiComponent2UIComponent>();
        }
        return this.uiComponentsTrees;
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

    /**
     * Gets the value of the userGroupLists property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userGroupLists property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserGroupLists().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserGroup }
     * 
     * 
     */
    public List<UserGroup> getUserGroupLists() {
        if (userGroupLists == null) {
            userGroupLists = new ArrayList<UserGroup>();
        }
        return this.userGroupLists;
    }

    /**
     * Gets the value of the userInterfaceComponentDatas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userInterfaceComponentDatas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserInterfaceComponentDatas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserInterfaceComponentData }
     * 
     * 
     */
    public List<UserInterfaceComponentData> getUserInterfaceComponentDatas() {
        if (userInterfaceComponentDatas == null) {
            userInterfaceComponentDatas = new ArrayList<UserInterfaceComponentData>();
        }
        return this.userInterfaceComponentDatas;
    }

    /**
     * Gets the value of the userLists property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userLists property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserLists().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link User }
     * 
     * 
     */
    public List<User> getUserLists() {
        if (userLists == null) {
            userLists = new ArrayList<User>();
        }
        return this.userLists;
    }

	@Override
	public String toString() {
		return "UserAdministrationRs [branchEmployees=" + branchEmployees
				+ ", branchInventories=" + branchInventories + ", branchs="
				+ branchs + ", exceptionDate=" + exceptionDate
				+ ", exceptionDateLists=" + exceptionDateLists
				+ ", exceptionDateListFulls=" + exceptionDateListFulls
				+ ", systemAcionLists=" + systemAcionLists + ", systemAction="
				+ systemAction + ", totalRow=" + totalRow + ", uiComponents="
				+ uiComponents + ", uiComponentsTrees=" + uiComponentsTrees
				+ ", user=" + user + ", userGroup=" + userGroup
				+ ", userGroupLists=" + userGroupLists
				+ ", userInterfaceComponentDatas="
				+ userInterfaceComponentDatas + ", userLists=" + userLists
				+ ", responseCode=" + responseCode + ", responseText="
				+ responseText + ", statusCode=" + statusCode + "]";
	}

}
