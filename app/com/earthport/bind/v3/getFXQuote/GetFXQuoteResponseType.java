//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.20 at 07:56:52 AM IST 
//


package com.earthport.bind.v3.getFXQuote;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.earthport.bind.v2.common.core.FXDetailType;


/**
 * <p>Java class for GetFXQuoteResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFXQuoteResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fxTicketID" type="{http://customer.endpoint.earthport.com/api/merchant/v2/components/core}UIDType"/>
 *         &lt;element name="fxDetail" type="{http://customer.endpoint.earthport.com/api/merchant/v2/components/core}FXDetailType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFXQuoteResponseType", propOrder = {
    "fxTicketID",
    "fxDetail"
})
public class GetFXQuoteResponseType {

    protected long fxTicketID;
    @XmlElement(required = true)
    protected FXDetailType fxDetail;

    /**
     * Gets the value of the fxTicketID property.
     * 
     */
    public long getFxTicketID() {
        return fxTicketID;
    }

    /**
     * Sets the value of the fxTicketID property.
     * 
     */
    public void setFxTicketID(long value) {
        this.fxTicketID = value;
    }

    /**
     * Gets the value of the fxDetail property.
     * 
     * @return
     *     possible object is
     *     {@link FXDetailType }
     *     
     */
    public FXDetailType getFxDetail() {
        return fxDetail;
    }

    /**
     * Sets the value of the fxDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FXDetailType }
     *     
     */
    public void setFxDetail(FXDetailType value) {
        this.fxDetail = value;
    }

}
