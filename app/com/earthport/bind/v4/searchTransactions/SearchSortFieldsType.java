//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.20 at 07:56:52 AM IST 
//


package com.earthport.bind.v4.searchTransactions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.earthport.bind.v2.common.core.AbstractSortFieldsType;


/**
 * <p>Java class for SearchSortFieldsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchSortFieldsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://customer.endpoint.earthport.com/api/merchant/v2/components/core}AbstractSortFieldsType">
 *       &lt;sequence>
 *         &lt;element name="sortField" type="{http://customer.endpoint.earthport.com/api/merchant/v4/services/searchTransactions}SearchSortValueType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchSortFieldsType", propOrder = {
    "sortField"
})
public class SearchSortFieldsType
    extends AbstractSortFieldsType
{

    @XmlElement(required = true)
    protected SearchSortValueType sortField;

    /**
     * Gets the value of the sortField property.
     * 
     * @return
     *     possible object is
     *     {@link SearchSortValueType }
     *     
     */
    public SearchSortValueType getSortField() {
        return sortField;
    }

    /**
     * Sets the value of the sortField property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchSortValueType }
     *     
     */
    public void setSortField(SearchSortValueType value) {
        this.sortField = value;
    }

}
