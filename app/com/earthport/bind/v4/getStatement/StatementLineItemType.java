//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.20 at 07:56:52 AM IST 
//


package com.earthport.bind.v4.getStatement;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.earthport.bind.v4.common.financialtransaction.FinancialTransactionType;


/**
 * 
 * 				A statement line item is a financial transaction that
 * 				affects the balance of an account.
 * 			
 * 
 * <p>Java class for StatementLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatementLineItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transaction" type="{http://customer.endpoint.earthport.com/api/merchant/v4/components/financialTransactionBase}FinancialTransactionType"/>
 *         &lt;element name="balance" type="{http://customer.endpoint.earthport.com/api/merchant/v2/components/core}GenericAmountType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatementLineItemType", propOrder = {
    "transaction",
    "balance"
})
public class StatementLineItemType {

    @XmlElement(required = true)
    protected FinancialTransactionType transaction;
    @XmlElement(required = true)
    protected BigDecimal balance;

    /**
     * Gets the value of the transaction property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialTransactionType }
     *     
     */
    public FinancialTransactionType getTransaction() {
        return transaction;
    }

    /**
     * Sets the value of the transaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialTransactionType }
     *     
     */
    public void setTransaction(FinancialTransactionType value) {
        this.transaction = value;
    }

    /**
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalance(BigDecimal value) {
        this.balance = value;
    }

}