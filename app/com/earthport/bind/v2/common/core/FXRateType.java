//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.20 at 07:56:52 AM IST 
//


package com.earthport.bind.v2.common.core;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Represents an FX rate between two currencies, the rate
 * 				is restricted to 6 decimal places.
 * 
 * 				The currency code is a three letter ISO 4217 code. E.g.
 * 				GBP for British sterling pounds.
 * 			
 * 
 * <p>Java class for FXRateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FXRateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="sellCurrency" type="{http://customer.endpoint.earthport.com/api/merchant/v2/components/core}CurrencyCodeType"/>
 *         &lt;element name="buyCurrency" type="{http://customer.endpoint.earthport.com/api/merchant/v2/components/core}CurrencyCodeType"/>
 *         &lt;element name="rate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FXRateType", propOrder = {

})
public class FXRateType {

    @XmlElement(required = true)
    protected String sellCurrency;
    @XmlElement(required = true)
    protected String buyCurrency;
    @XmlElement(required = true)
    protected BigDecimal rate;

    /**
     * Gets the value of the sellCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellCurrency() {
        return sellCurrency;
    }

    /**
     * Sets the value of the sellCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellCurrency(String value) {
        this.sellCurrency = value;
    }

    /**
     * Gets the value of the buyCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyCurrency() {
        return buyCurrency;
    }

    /**
     * Sets the value of the buyCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyCurrency(String value) {
        this.buyCurrency = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }

}
