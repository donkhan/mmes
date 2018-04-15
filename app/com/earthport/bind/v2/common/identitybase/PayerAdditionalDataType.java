//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.20 at 07:56:52 AM IST 
//


package com.earthport.bind.v2.common.identitybase;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Represents a set of name value pairs that can be
 * 				supplied
 * 				with the Identity information.
 * 
 * 				The keys will be validated on the server side against a list of valid
 * 				types that
 * 				are accepted. See the "API Solution Guide" for further
 * 				details.
 * 
 * 				Both the key and the value are required if adding additional data
 * 
 * 				The length of the additionalDataKey field is currently restricted to 50
 * 				bytes and
 * 				will be truncated if the value is too long.
 * 
 * 				The length of the additionalDataValue field is currently restricted to
 * 				254 bytes
 * 				and will be truncated if the value is too long.
 * 			
 * 
 * <p>Java class for PayerAdditionalDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayerAdditionalDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="additionalDataKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="additionalDataValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayerAdditionalDataType", propOrder = {
    "additionalDataKey",
    "additionalDataValue"
})
public class PayerAdditionalDataType {

    @XmlElement(required = true)
    protected String additionalDataKey;
    @XmlElement(required = true)
    protected String additionalDataValue;

    /**
     * Gets the value of the additionalDataKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalDataKey() {
        return additionalDataKey;
    }

    /**
     * Sets the value of the additionalDataKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalDataKey(String value) {
        this.additionalDataKey = value;
    }

    /**
     * Gets the value of the additionalDataValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalDataValue() {
        return additionalDataValue;
    }

    /**
     * Sets the value of the additionalDataValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalDataValue(String value) {
        this.additionalDataValue = value;
    }

}
