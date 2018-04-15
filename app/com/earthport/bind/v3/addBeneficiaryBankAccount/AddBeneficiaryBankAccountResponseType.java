//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.20 at 07:56:52 AM IST 
//


package com.earthport.bind.v3.addBeneficiaryBankAccount;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.earthport.bind.v3.common.bankbase.UsersBankIDType;


/**
 * <p>Java class for AddBeneficiaryBankAccountResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddBeneficiaryBankAccountResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usersBankID" type="{http://customer.endpoint.earthport.com/api/merchant/v3/components/bankBase}UsersBankIDType"/>
 *         &lt;element name="warnings" type="{http://customer.endpoint.earthport.com/api/merchant/v3/services/addBeneficiaryBankAccount}WarningsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddBeneficiaryBankAccountResponseType", propOrder = {
    "usersBankID",
    "warnings"
})
public class AddBeneficiaryBankAccountResponseType {

    @XmlElement(required = true)
    protected UsersBankIDType usersBankID;
    protected WarningsType warnings;

    /**
     * Gets the value of the usersBankID property.
     * 
     * @return
     *     possible object is
     *     {@link UsersBankIDType }
     *     
     */
    public UsersBankIDType getUsersBankID() {
        return usersBankID;
    }

    /**
     * Sets the value of the usersBankID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsersBankIDType }
     *     
     */
    public void setUsersBankID(UsersBankIDType value) {
        this.usersBankID = value;
    }

    /**
     * Gets the value of the warnings property.
     * 
     * @return
     *     possible object is
     *     {@link WarningsType }
     *     
     */
    public WarningsType getWarnings() {
        return warnings;
    }

    /**
     * Sets the value of the warnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link WarningsType }
     *     
     */
    public void setWarnings(WarningsType value) {
        this.warnings = value;
    }

}