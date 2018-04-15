//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.20 at 07:56:52 AM IST 
//


package com.earthport.bind.v1.common.identityFieldsBase;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 This type defines a list of identity data groups.
 *                 Each group is normally
 *                 represented as a section of fields on the UI.
 *             
 * 
 * <p>Java class for BeneficiaryIdentityGroupsListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BeneficiaryIdentityGroupsListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="beneficiaryIdentityFieldGroup" type="{http://customer.endpoint.earthport.com/api/merchant/v1/components/identityFieldsBase}BeneficiaryIdentityGroupType"/>
 *           &lt;element name="beneficiaryIdentityFieldGroupChoice" type="{http://customer.endpoint.earthport.com/api/merchant/v1/components/identityFieldsBase}BeneficiaryIdentityFieldGroupChoiceType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="groupLabel" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BeneficiaryIdentityGroupsListType", propOrder = {
    "beneficiaryIdentityFieldGroupOrBeneficiaryIdentityFieldGroupChoice"
})
public class BeneficiaryIdentityGroupsListType {

    @XmlElements({
        @XmlElement(name = "beneficiaryIdentityFieldGroupChoice", type = BeneficiaryIdentityFieldGroupChoiceType.class),
        @XmlElement(name = "beneficiaryIdentityFieldGroup", type = BeneficiaryIdentityGroupType.class)
    })
    protected List<Object> beneficiaryIdentityFieldGroupOrBeneficiaryIdentityFieldGroupChoice;
    @XmlAttribute(name = "groupLabel", required = true)
    protected String groupLabel;

    /**
     * Gets the value of the beneficiaryIdentityFieldGroupOrBeneficiaryIdentityFieldGroupChoice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beneficiaryIdentityFieldGroupOrBeneficiaryIdentityFieldGroupChoice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBeneficiaryIdentityFieldGroupOrBeneficiaryIdentityFieldGroupChoice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BeneficiaryIdentityFieldGroupChoiceType }
     * {@link BeneficiaryIdentityGroupType }
     * 
     * 
     */
    public List<Object> getBeneficiaryIdentityFieldGroupOrBeneficiaryIdentityFieldGroupChoice() {
        if (beneficiaryIdentityFieldGroupOrBeneficiaryIdentityFieldGroupChoice == null) {
            beneficiaryIdentityFieldGroupOrBeneficiaryIdentityFieldGroupChoice = new ArrayList<Object>();
        }
        return this.beneficiaryIdentityFieldGroupOrBeneficiaryIdentityFieldGroupChoice;
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

}
