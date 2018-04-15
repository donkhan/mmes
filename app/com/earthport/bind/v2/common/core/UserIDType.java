//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.20 at 07:56:52 AM IST 
//


package com.earthport.bind.v2.common.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This group consists of all possible user identifier
 * 				types.
 * 
 * 				The 'epUserID' field is a unique identifier for a
 * 				merchant and is the equivalent of a Virtual Account
 * 				Number (VAN).
 * 
 * 				The 'merchantUserID' is a merchant specified identifier
 * 				for an individual or company that an account was set up
 * 				for.
 * 
 * 				The 'epUserID', 'merchantUserID' or both 'epUserID' and
 * 				'merchantUserID' can be supplied. A mapping will be
 * 				performed to retrieve the merchant user ID from the
 * 				supplied EP user ID and vice versa.
 * 
 * 				If both the 'epUserID' and 'merchantUserID' are
 * 				supplied, a check will be performed to ensure that the
 * 				two are mapped. If the two provided fields are not
 * 				mapped, then a validation error code will be returned.
 * 
 * 				At least one of the fields must be populated.
 * 			
 * 
 * <p>Java class for UserIDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserIDType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="epUserID" type="{http://customer.endpoint.earthport.com/api/merchant/v2/components/core}EPUserIDType" minOccurs="0"/>
 *         &lt;element name="merchantUserID" type="{http://customer.endpoint.earthport.com/api/merchant/v2/components/core}MerchantUserIDType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserIDType", propOrder = {
    "epUserID",
    "merchantUserID"
})
public class UserIDType {

    protected String epUserID;
    protected String merchantUserID;

    /**
     * Gets the value of the epUserID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEpUserID() {
        return epUserID;
    }

    /**
     * Sets the value of the epUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEpUserID(String value) {
        this.epUserID = value;
    }

    /**
     * Gets the value of the merchantUserID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantUserID() {
        return merchantUserID;
    }

    /**
     * Sets the value of the merchantUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantUserID(String value) {
        this.merchantUserID = value;
    }

}
