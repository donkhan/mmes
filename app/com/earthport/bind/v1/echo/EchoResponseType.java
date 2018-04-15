//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.20 at 07:56:52 AM IST 
//


package com.earthport.bind.v1.echo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 A successful request returns the string that was passed in as part
 *                 of the echo request.
 *             
 * 
 * <p>Java class for EchoResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EchoResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="echoResponse" type="{http://customer.endpoint.earthport.com/api/merchant/v1/services/echo}EchoStringType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EchoResponseType", propOrder = {
    "echoResponse"
})
public class EchoResponseType {

    @XmlElement(required = true)
    protected String echoResponse;

    /**
     * Gets the value of the echoResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEchoResponse() {
        return echoResponse;
    }

    /**
     * Sets the value of the echoResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEchoResponse(String value) {
        this.echoResponse = value;
    }

}