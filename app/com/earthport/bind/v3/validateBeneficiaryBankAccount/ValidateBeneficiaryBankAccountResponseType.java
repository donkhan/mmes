//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.20 at 07:56:52 AM IST 
//


package com.earthport.bind.v3.validateBeneficiaryBankAccount;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidateBeneficiaryBankAccountResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidateBeneficiaryBankAccountResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="isBankAccountValid" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateBeneficiaryBankAccountResponseType", propOrder = {

})
public class ValidateBeneficiaryBankAccountResponseType {

    protected boolean isBankAccountValid;

    /**
     * Gets the value of the isBankAccountValid property.
     * 
     */
    public boolean isIsBankAccountValid() {
        return isBankAccountValid;
    }

    /**
     * Sets the value of the isBankAccountValid property.
     * 
     */
    public void setIsBankAccountValid(boolean value) {
        this.isBankAccountValid = value;
    }

}
