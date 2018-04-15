//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.20 at 07:56:52 AM IST 
//


package com.earthport.bind.v2.common.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.earthport.bind.v4.searchTransactions.SearchTransactionsCriteriaType;


/**
 * 
 *         	Base type of all search criteria elements. Allows for extra sorting 
 *         	parameters to be passed in addition to service specific search 
 *         	criteria.
 *         	
 * 
 * <p>Java class for AbstractSearchCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractSearchCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sortCriteria" type="{http://customer.endpoint.earthport.com/api/merchant/v2/components/core}SortCriteriaType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractSearchCriteriaType", propOrder = {
    "sortCriteria"
})
@XmlSeeAlso({
    SearchTransactionsCriteriaType.class
})
public abstract class AbstractSearchCriteriaType {

    @XmlElement(required = true)
    protected SortCriteriaType sortCriteria;

    /**
     * Gets the value of the sortCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link SortCriteriaType }
     *     
     */
    public SortCriteriaType getSortCriteria() {
        return sortCriteria;
    }

    /**
     * Sets the value of the sortCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortCriteriaType }
     *     
     */
    public void setSortCriteria(SortCriteriaType value) {
        this.sortCriteria = value;
    }

}
