//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.20 at 07:56:52 AM IST 
//


package com.earthport.bind.v2.getPayerIdentity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.earthport.bind.v2.common.core.UserIDType;
import com.earthport.bind.v2.common.identitybase.PayerIdentityResponseType;


/**
 * <p>Java class for getPayerIdentityResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPayerIdentityResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userID" type="{http://customer.endpoint.earthport.com/api/merchant/v2/components/core}UserIDType"/>
 *         &lt;element name="payerIdentity" type="{http://customer.endpoint.earthport.com/api/merchant/v2/components/identityBase}PayerIdentityResponseType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPayerIdentityResponseType", propOrder = {
    "userID",
    "payerIdentity"
})
public class GetPayerIdentityResponseType {

    @XmlElement(required = true)
    protected UserIDType userID;
    protected List<PayerIdentityResponseType> payerIdentity;

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link UserIDType }
     *     
     */
    public UserIDType getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserIDType }
     *     
     */
    public void setUserID(UserIDType value) {
        this.userID = value;
    }

    /**
     * Gets the value of the payerIdentity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payerIdentity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayerIdentity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PayerIdentityResponseType }
     * 
     * 
     */
    public List<PayerIdentityResponseType> getPayerIdentity() {
        if (payerIdentity == null) {
            payerIdentity = new ArrayList<PayerIdentityResponseType>();
        }
        return this.payerIdentity;
    }

}
