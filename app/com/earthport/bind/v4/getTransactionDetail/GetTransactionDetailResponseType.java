//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.20 at 07:56:52 AM IST 
//


package com.earthport.bind.v4.getTransactionDetail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetTransactionDetailResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetTransactionDetailResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionDetailMappings" type="{http://customer.endpoint.earthport.com/api/merchant/v4/services/getTransactionDetail}TransactionDetailMappingListType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTransactionDetailResponseType", propOrder = {
    "transactionDetailMappings"
})
public class GetTransactionDetailResponseType {

    @XmlElement(required = true)
    protected TransactionDetailMappingListType transactionDetailMappings;

    /**
     * Gets the value of the transactionDetailMappings property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionDetailMappingListType }
     *     
     */
    public TransactionDetailMappingListType getTransactionDetailMappings() {
        return transactionDetailMappings;
    }

    /**
     * Sets the value of the transactionDetailMappings property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionDetailMappingListType }
     *     
     */
    public void setTransactionDetailMappings(TransactionDetailMappingListType value) {
        this.transactionDetailMappings = value;
    }

}
