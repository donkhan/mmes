//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.20 at 07:56:52 AM IST 
//


package com.earthport.bind.v3.common.bankbase;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type defines a list of bank account data groups.
 * 				Each group is normally represented as a row on the UI.
 * 			
 * 
 * <p>Java class for BeneficiaryBankAccountGroupsListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BeneficiaryBankAccountGroupsListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="beneficiaryBankAccountFieldGroup" type="{http://customer.endpoint.earthport.com/api/merchant/v3/components/bankBase}BeneficiaryBankAccountGroupType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BeneficiaryBankAccountGroupsListType", propOrder = {
    "beneficiaryBankAccountFieldGroup"
})
public class BeneficiaryBankAccountGroupsListType {

    protected List<BeneficiaryBankAccountGroupType> beneficiaryBankAccountFieldGroup;

    /**
     * Gets the value of the beneficiaryBankAccountFieldGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beneficiaryBankAccountFieldGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBeneficiaryBankAccountFieldGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BeneficiaryBankAccountGroupType }
     * 
     * 
     */
    public List<BeneficiaryBankAccountGroupType> getBeneficiaryBankAccountFieldGroup() {
        if (beneficiaryBankAccountFieldGroup == null) {
            beneficiaryBankAccountFieldGroup = new ArrayList<BeneficiaryBankAccountGroupType>();
        }
        return this.beneficiaryBankAccountFieldGroup;
    }

}
