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
 *             	ComplexType wrapper for the beneficiary identity UID.
 *             
 * 
 * <p>Java class for BeneficiaryIdentityIDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BeneficiaryIdentityIDType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="beneficiaryIdentityID" type="{http://customer.endpoint.earthport.com/api/merchant/v2/components/core}UIDType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BeneficiaryIdentityIDType", propOrder = {
    "beneficiaryIdentityID"
})
public class BeneficiaryIdentityIDType {

    protected long beneficiaryIdentityID;

    /**
     * Gets the value of the beneficiaryIdentityID property.
     * 
     */
    public long getBeneficiaryIdentityID() {
        return beneficiaryIdentityID;
    }

    /**
     * Sets the value of the beneficiaryIdentityID property.
     * 
     */
    public void setBeneficiaryIdentityID(long value) {
        this.beneficiaryIdentityID = value;
    }

}
