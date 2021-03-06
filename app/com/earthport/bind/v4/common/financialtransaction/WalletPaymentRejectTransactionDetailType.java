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
import javax.xml.bind.annotation.XmlType;
import com.earthport.bind.v2.common.core.FXExecutedRateType;
import com.earthport.bind.v2.common.core.MonetaryValueType;
import com.earthport.bind.v2.common.core.ReasonType;


/**
 * 
 * 				A financial transaction representing the rejection or refund or a payment
 * 				to a beneficiary wallet back to the merchant's account.
 * 				This element contains all details pertaining to this financial transaction.
 * 			
 * 
 * <p>Java class for WalletPaymentRejectTransactionDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WalletPaymentRejectTransactionDetailType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://customer.endpoint.earthport.com/api/merchant/v4/components/financialTransactionBase}WalletPaymentRejectTransactionType">
 *       &lt;sequence>
 *         &lt;element name="fxExecutedDetail" type="{http://customer.endpoint.earthport.com/api/merchant/v2/components/core}FXExecutedRateType" minOccurs="0"/>
 *         &lt;element name="amountRefundedByProvider" type="{http://customer.endpoint.earthport.com/api/merchant/v2/components/core}MonetaryValueType"/>
 *         &lt;element name="amountRefundedToCustomer" type="{http://customer.endpoint.earthport.com/api/merchant/v2/components/core}MonetaryValueType"/>
 *         &lt;element name="reason" type="{http://customer.endpoint.earthport.com/api/merchant/v2/components/core}ReasonType" minOccurs="0"/>
 *         &lt;element name="originalWalletPaymentTransaction" type="{http://customer.endpoint.earthport.com/api/merchant/v4/components/financialTransactionBase}WalletPaymentTransactionType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WalletPaymentRejectTransactionDetailType", propOrder = {
    "fxExecutedDetail",
    "amountRefundedByProvider",
    "amountRefundedToCustomer",
    "reason",
    "originalWalletPaymentTransaction"
})
public class WalletPaymentRejectTransactionDetailType
    extends WalletPaymentRejectTransactionType
{

    protected FXExecutedRateType fxExecutedDetail;
    @XmlElement(required = true)
    protected MonetaryValueType amountRefundedByProvider;
    @XmlElement(required = true)
    protected MonetaryValueType amountRefundedToCustomer;
    protected ReasonType reason;
    @XmlElement(required = true)
    protected WalletPaymentTransactionType originalWalletPaymentTransaction;

    /**
     * Gets the value of the fxExecutedDetail property.
     * 
     * @return
     *     possible object is
     *     {@link FXExecutedRateType }
     *     
     */
    public FXExecutedRateType getFxExecutedDetail() {
        return fxExecutedDetail;
    }

    /**
     * Sets the value of the fxExecutedDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FXExecutedRateType }
     *     
     */
    public void setFxExecutedDetail(FXExecutedRateType value) {
        this.fxExecutedDetail = value;
    }

    /**
     * Gets the value of the amountRefundedByProvider property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryValueType }
     *     
     */
    public MonetaryValueType getAmountRefundedByProvider() {
        return amountRefundedByProvider;
    }

    /**
     * Sets the value of the amountRefundedByProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryValueType }
     *     
     */
    public void setAmountRefundedByProvider(MonetaryValueType value) {
        this.amountRefundedByProvider = value;
    }

    /**
     * Gets the value of the amountRefundedToCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryValueType }
     *     
     */
    public MonetaryValueType getAmountRefundedToCustomer() {
        return amountRefundedToCustomer;
    }

    /**
     * Sets the value of the amountRefundedToCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryValueType }
     *     
     */
    public void setAmountRefundedToCustomer(MonetaryValueType value) {
        this.amountRefundedToCustomer = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link ReasonType }
     *     
     */
    public ReasonType getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReasonType }
     *     
     */
    public void setReason(ReasonType value) {
        this.reason = value;
    }

    /**
     * Gets the value of the originalWalletPaymentTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link WalletPaymentTransactionType }
     *     
     */
    public WalletPaymentTransactionType getOriginalWalletPaymentTransaction() {
        return originalWalletPaymentTransaction;
    }

    /**
     * Sets the value of the originalWalletPaymentTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link WalletPaymentTransactionType }
     *     
     */
    public void setOriginalWalletPaymentTransaction(WalletPaymentTransactionType value) {
        this.originalWalletPaymentTransaction = value;
    }

}
