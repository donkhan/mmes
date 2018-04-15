//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.20 at 07:56:52 AM IST 
//


package com.earthport.endpoint.customer.api.merchant.v1.processwalletpayment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.earthport.bind.v2.common.identitybase.BeneficiaryIdentityType;


/**
 * <p>Java class for providerWalletDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="providerWalletDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="walletProvider" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="registeredWalletHolderDetails" type="{http://customer.endpoint.earthport.com/api/merchant/v2/components/identityBase}BeneficiaryIdentityType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "providerWalletDetailsType", propOrder = {
    "walletProvider",
    "registeredWalletHolderDetails"
})
public class ProviderWalletDetailsType {

    @XmlElement(required = true)
    protected String walletProvider;
    @XmlElement(required = true)
    protected BeneficiaryIdentityType registeredWalletHolderDetails;

    /**
     * Gets the value of the walletProvider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWalletProvider() {
        return walletProvider;
    }

    /**
     * Sets the value of the walletProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWalletProvider(String value) {
        this.walletProvider = value;
    }

    /**
     * Gets the value of the registeredWalletHolderDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BeneficiaryIdentityType }
     *     
     */
    public BeneficiaryIdentityType getRegisteredWalletHolderDetails() {
        return registeredWalletHolderDetails;
    }

    /**
     * Sets the value of the registeredWalletHolderDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeneficiaryIdentityType }
     *     
     */
    public void setRegisteredWalletHolderDetails(BeneficiaryIdentityType value) {
        this.registeredWalletHolderDetails = value;
    }

}