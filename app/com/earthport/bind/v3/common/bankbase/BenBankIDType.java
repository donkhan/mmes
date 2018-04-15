//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.20 at 07:56:52 AM IST 
//


package com.earthport.bind.v3.common.bankbase;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This group consists of all possible beneficiary bank
 * 				identifier types.
 * 
 * 				The 'epBankID' field is a unique identifier for a
 * 				beneficiary bank account.
 * 
 * 				The 'merchantBankID' is an optional merchant specified
 * 				identifier for the beneficiary bank account.
 * 
 * 				The 'epBankID', 'merchantBankID' or both 'epBankID' and
 * 				'merchantBankID' can be supplied. A mapping will be
 * 				performed to retrieve the merchant bank ID from the
 * 				supplied EP bank ID and vice versa.
 * 
 * 				If both the 'epBankID' and 'merchantBankID' are
 * 				supplied, a check will be performed to ensure that the
 * 				two are mapped. If the two provided fields are not
 * 				mapped, then a validation error code will be returned.
 * 
 * 				At least one of the fields must be populated.
 * 			
 * 
 * <p>Java class for BenBankIDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BenBankIDType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="epBankID" type="{http://customer.endpoint.earthport.com/api/merchant/v3/components/bankBase}EPBankIDType" minOccurs="0"/>
 *         &lt;element name="merchantBankID" type="{http://customer.endpoint.earthport.com/api/merchant/v3/components/bankBase}MerchantBankIDType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BenBankIDType", propOrder = {
    "epBankID",
    "merchantBankID"
})
public class BenBankIDType {

    protected Long epBankID;
    protected String merchantBankID;

    /**
     * Gets the value of the epBankID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEpBankID() {
        return epBankID;
    }

    /**
     * Sets the value of the epBankID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEpBankID(Long value) {
        this.epBankID = value;
    }

    /**
     * Gets the value of the merchantBankID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantBankID() {
        return merchantBankID;
    }

    /**
     * Sets the value of the merchantBankID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantBankID(String value) {
        this.merchantBankID = value;
    }

}