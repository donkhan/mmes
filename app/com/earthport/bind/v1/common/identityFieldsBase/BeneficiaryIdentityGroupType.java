//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.20 at 07:56:52 AM IST 
//


package com.earthport.bind.v1.common.identityFieldsBase;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 This type defines a beneficiary identity data group.
 *                 Each group is normally represented as a section of fields on the UI.
 *                 'groupLabel' is the UI test to display as a name for this section.
 *                 'mandatory' indicates whether all section is mandatory.
 *                 'elementName' is the name of the element in the addBeneficiaryBankAccount
 *                 request document for the corresponding section.
 *             
 * 
 * <p>Java class for BeneficiaryIdentityGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BeneficiaryIdentityGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="beneficiaryIdentityFieldsList" type="{http://customer.endpoint.earthport.com/api/merchant/v1/components/identityFieldsBase}BeneficiaryIdentityFieldsListType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="groupLabel" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mandatory" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="elementName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BeneficiaryIdentityGroupType", propOrder = {
    "beneficiaryIdentityFieldsList"
})
public class BeneficiaryIdentityGroupType {

    @XmlElement(required = true)
    protected BeneficiaryIdentityFieldsListType beneficiaryIdentityFieldsList;
    @XmlAttribute(name = "groupLabel", required = true)
    protected String groupLabel;
    @XmlAttribute(name = "mandatory", required = true)
    protected String mandatory;
    @XmlAttribute(name = "elementName", required = true)
    protected String elementName;

    /**
     * Gets the value of the beneficiaryIdentityFieldsList property.
     * 
     * @return
     *     possible object is
     *     {@link BeneficiaryIdentityFieldsListType }
     *     
     */
    public BeneficiaryIdentityFieldsListType getBeneficiaryIdentityFieldsList() {
        return beneficiaryIdentityFieldsList;
    }

    /**
     * Sets the value of the beneficiaryIdentityFieldsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeneficiaryIdentityFieldsListType }
     *     
     */
    public void setBeneficiaryIdentityFieldsList(BeneficiaryIdentityFieldsListType value) {
        this.beneficiaryIdentityFieldsList = value;
    }

    /**
     * Gets the value of the groupLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupLabel() {
        return groupLabel;
    }

    /**
     * Sets the value of the groupLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupLabel(String value) {
        this.groupLabel = value;
    }

    /**
     * Gets the value of the mandatory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMandatory() {
        return mandatory;
    }

    /**
     * Sets the value of the mandatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMandatory(String value) {
        this.mandatory = value;
    }

    /**
     * Gets the value of the elementName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementName() {
        return elementName;
    }

    /**
     * Sets the value of the elementName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementName(String value) {
        this.elementName = value;
    }

}