//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.20 at 07:56:52 AM IST 
//


package com.earthport.bind.v4.common.financialtransaction;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.earthport.bind.v1.common.walletBaseTypes.UsersWalletIDType;


/**
 * 
 * 				A financial transaction representing payment to a 
 * 				beneficiary wallet from an account held in the EPS system.
 * 			
 * 
 * <p>Java class for WalletPaymentTransactionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WalletPaymentTransactionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://customer.endpoint.earthport.com/api/merchant/v4/components/financialTransactionBase}FinancialTransactionType">
 *       &lt;sequence>
 *         &lt;element name="merchantTransactionReference" type="{http://customer.endpoint.earthport.com/api/merchant/v2/components/core}MerchantTransactionRefType"/>
 *         &lt;element name="usersWalletId" type="{http://customer.endpoint.earthport.com/api/merchant/v1/components/walletBase}UsersWalletIDType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WalletPaymentTransactionType", propOrder = {
    "merchantTransactionReference",
    "usersWalletId"
})
@XmlSeeAlso({
    WalletPaymentTransactionDetailType.class
})
public class WalletPaymentTransactionType
    extends FinancialTransactionType
{

    @XmlElement(required = true)
    protected String merchantTransactionReference;
    @XmlElement(required = true)
    protected UsersWalletIDType usersWalletId;

    /**
     * Gets the value of the merchantTransactionReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantTransactionReference() {
        return merchantTransactionReference;
    }

    /**
     * Sets the value of the merchantTransactionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantTransactionReference(String value) {
        this.merchantTransactionReference = value;
    }

    /**
     * Gets the value of the usersWalletId property.
     * 
     * @return
     *     possible object is
     *     {@link UsersWalletIDType }
     *     
     */
    public UsersWalletIDType getUsersWalletId() {
        return usersWalletId;
    }

    /**
     * Sets the value of the usersWalletId property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsersWalletIDType }
     *     
     */
    public void setUsersWalletId(UsersWalletIDType value) {
        this.usersWalletId = value;
    }

}
