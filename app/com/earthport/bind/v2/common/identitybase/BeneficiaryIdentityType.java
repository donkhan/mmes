//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.20 at 07:56:52 AM IST 
//


package com.earthport.bind.v2.common.identitybase;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Represents the beneficiary identity of an
 * 				individual or
 * 				legal entity.
 * 
 * 				You must specify one of either a beneficiary individual identity or
 * 				beneficiary legal entity identity or beneficiary unstructured identity
 * 			
 * 
 * <p>Java class for BeneficiaryIdentityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BeneficiaryIdentityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="beneficiaryIndividualIdentity" type="{http://customer.endpoint.earthport.com/api/merchant/v2/components/identityBase}BeneficiaryIndividualIdentityType" minOccurs="0"/>
 *         &lt;element name="beneficiaryLegalEntityIdentity" type="{http://customer.endpoint.earthport.com/api/merchant/v2/components/identityBase}BeneficiaryLegalEntityIdentityType" minOccurs="0"/>
 *         &lt;element name="beneficiaryUnstructuredIdentity" type="{http://customer.endpoint.earthport.com/api/merchant/v2/components/identityBase}UnstructuredIdentityType" minOccurs="0"/>
 *         &lt;element name="additionalDataList" type="{http://customer.endpoint.earthport.com/api/merchant/v2/components/identityBase}BeneficiaryAdditionalDataListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BeneficiaryIdentityType", propOrder = {
    "beneficiaryIndividualIdentity",
    "beneficiaryLegalEntityIdentity",
    "beneficiaryUnstructuredIdentity",
    "additionalDataList"
})
public class BeneficiaryIdentityType {

    protected BeneficiaryIndividualIdentityType beneficiaryIndividualIdentity;
    protected BeneficiaryLegalEntityIdentityType beneficiaryLegalEntityIdentity;
    protected UnstructuredIdentityType beneficiaryUnstructuredIdentity;
    protected BeneficiaryAdditionalDataListType additionalDataList;

    /**
     * Gets the value of the beneficiaryIndividualIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link BeneficiaryIndividualIdentityType }
     *     
     */
    public BeneficiaryIndividualIdentityType getBeneficiaryIndividualIdentity() {
        return beneficiaryIndividualIdentity;
    }

    /**
     * Sets the value of the beneficiaryIndividualIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeneficiaryIndividualIdentityType }
     *     
     */
    public void setBeneficiaryIndividualIdentity(BeneficiaryIndividualIdentityType value) {
        this.beneficiaryIndividualIdentity = value;
    }

    /**
     * Gets the value of the beneficiaryLegalEntityIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link BeneficiaryLegalEntityIdentityType }
     *     
     */
    public BeneficiaryLegalEntityIdentityType getBeneficiaryLegalEntityIdentity() {
        return beneficiaryLegalEntityIdentity;
    }

    /**
     * Sets the value of the beneficiaryLegalEntityIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeneficiaryLegalEntityIdentityType }
     *     
     */
    public void setBeneficiaryLegalEntityIdentity(BeneficiaryLegalEntityIdentityType value) {
        this.beneficiaryLegalEntityIdentity = value;
    }

    /**
     * Gets the value of the beneficiaryUnstructuredIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link UnstructuredIdentityType }
     *     
     */
    public UnstructuredIdentityType getBeneficiaryUnstructuredIdentity() {
        return beneficiaryUnstructuredIdentity;
    }

    /**
     * Sets the value of the beneficiaryUnstructuredIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnstructuredIdentityType }
     *     
     */
    public void setBeneficiaryUnstructuredIdentity(UnstructuredIdentityType value) {
        this.beneficiaryUnstructuredIdentity = value;
    }

    /**
     * Gets the value of the additionalDataList property.
     * 
     * @return
     *     possible object is
     *     {@link BeneficiaryAdditionalDataListType }
     *     
     */
    public BeneficiaryAdditionalDataListType getAdditionalDataList() {
        return additionalDataList;
    }

    /**
     * Sets the value of the additionalDataList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeneficiaryAdditionalDataListType }
     *     
     */
    public void setAdditionalDataList(BeneficiaryAdditionalDataListType value) {
        this.additionalDataList = value;
    }

}