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
import javax.xml.datatype.XMLGregorianCalendar;
import com.earthport.bind.v2.common.core.MonetaryValueType;
import com.earthport.bind.v2.common.core.MoneyMovementType;


/**
 * 
 * 				Minimum set of data that constitutes a financial
 * 				transaction.
 * 			
 * 
 * <p>Java class for FinancialTransactionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialTransactionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="epTransactionID" type="{http://customer.endpoint.earthport.com/api/merchant/v2/components/core}PaymentIDType"/>
 *         &lt;element name="timestamp" type="{http://customer.endpoint.earthport.com/api/merchant/v2/components/core}GenericTimestampType"/>
 *         &lt;element name="transactionType" type="{http://customer.endpoint.earthport.com/api/merchant/v4/components/financialTransactionBase}FinancialTransactionTypeType"/>
 *         &lt;element name="transactionStatus" type="{http://customer.endpoint.earthport.com/api/merchant/v4/components/financialTransactionBase}FinancialTransactionStatusType" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://customer.endpoint.earthport.com/api/merchant/v2/components/core}MonetaryValueType"/>
 *         &lt;element name="movementType" type="{http://customer.endpoint.earthport.com/api/merchant/v2/components/core}MoneyMovementType"/>
 *         &lt;element name="statementDetail" type="{http://customer.endpoint.earthport.com/api/merchant/v4/components/financialTransactionBase}StatementDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialTransactionType", propOrder = {
    "epTransactionID",
    "timestamp",
    "transactionType",
    "transactionStatus",
    "amount",
    "movementType",
    "statementDetail"
})
@XmlSeeAlso({
    GenericTransactionType.class,
    EarthportMerchantLiquidityTransferType.class,
    RefundType.class,
    WalletPaymentRejectTransactionType.class,
    UserDepositType.class,
    PayoutTransactionType.class,
    WalletPaymentTransactionType.class,
    LiquidityDepositType.class,
    MerchantLiquidityMovementType.class,
    JournalType.class
})
public abstract class FinancialTransactionType {

    protected long epTransactionID;
    @XmlElement(required = true)
    protected XMLGregorianCalendar timestamp;
    @XmlElement(required = true)
    protected FinancialTransactionTypeType transactionType;
    protected FinancialTransactionStatusType transactionStatus;
    @XmlElement(required = true)
    protected MonetaryValueType amount;
    @XmlElement(required = true)
    protected MoneyMovementType movementType;
    protected StatementDetail statementDetail;

    /**
     * Gets the value of the epTransactionID property.
     * 
     */
    public long getEpTransactionID() {
        return epTransactionID;
    }

    /**
     * Sets the value of the epTransactionID property.
     * 
     */
    public void setEpTransactionID(long value) {
        this.epTransactionID = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialTransactionTypeType }
     *     
     */
    public FinancialTransactionTypeType getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialTransactionTypeType }
     *     
     */
    public void setTransactionType(FinancialTransactionTypeType value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the transactionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialTransactionStatusType }
     *     
     */
    public FinancialTransactionStatusType getTransactionStatus() {
        return transactionStatus;
    }

    /**
     * Sets the value of the transactionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialTransactionStatusType }
     *     
     */
    public void setTransactionStatus(FinancialTransactionStatusType value) {
        this.transactionStatus = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryValueType }
     *     
     */
    public MonetaryValueType getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryValueType }
     *     
     */
    public void setAmount(MonetaryValueType value) {
        this.amount = value;
    }

    /**
     * Gets the value of the movementType property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyMovementType }
     *     
     */
    public MoneyMovementType getMovementType() {
        return movementType;
    }

    /**
     * Sets the value of the movementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyMovementType }
     *     
     */
    public void setMovementType(MoneyMovementType value) {
        this.movementType = value;
    }

    /**
     * Gets the value of the statementDetail property.
     * 
     * @return
     *     possible object is
     *     {@link StatementDetail }
     *     
     */
    public StatementDetail getStatementDetail() {
        return statementDetail;
    }

    /**
     * Sets the value of the statementDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementDetail }
     *     
     */
    public void setStatementDetail(StatementDetail value) {
        this.statementDetail = value;
    }

}