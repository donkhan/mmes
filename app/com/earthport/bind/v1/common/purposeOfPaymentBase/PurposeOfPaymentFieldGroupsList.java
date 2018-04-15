//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.20 at 07:56:52 AM IST 
//


package com.earthport.bind.v1.common.purposeOfPaymentBase;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This group contains all configuration information
 * 				for Purpose of Payment options.
 * 
 * 				The "mandatory" attribute indicates whether 
 * 				provision of Purpose of Payment data is 
 * 				required for the Payout to be accepted.
 * 
 * 			
 * 
 * <p>Java class for purposeOfPaymentFieldGroupsList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purposeOfPaymentFieldGroupsList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="purposeOfPaymentCode" type="{http://customer.endpoint.earthport.com/api/merchant/v1/components/purposeOfPaymentBase}purposeOfPaymentCode" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="mandatory" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purposeOfPaymentFieldGroupsList", propOrder = {
    "purposeOfPaymentCode"
})
public class PurposeOfPaymentFieldGroupsList {

    protected List<PurposeOfPaymentCode> purposeOfPaymentCode;
    @XmlAttribute(name = "mandatory", required = true)
    protected boolean mandatory;

    /**
     * Gets the value of the purposeOfPaymentCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purposeOfPaymentCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurposeOfPaymentCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PurposeOfPaymentCode }
     * 
     * 
     */
    public List<PurposeOfPaymentCode> getPurposeOfPaymentCode() {
        if (purposeOfPaymentCode == null) {
            purposeOfPaymentCode = new ArrayList<PurposeOfPaymentCode>();
        }
        return this.purposeOfPaymentCode;
    }

    /**
     * Gets the value of the mandatory property.
     * 
     */
    public boolean isMandatory() {
        return mandatory;
    }

    /**
     * Sets the value of the mandatory property.
     * 
     */
    public void setMandatory(boolean value) {
        this.mandatory = value;
    }

}