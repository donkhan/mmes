//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.20 at 07:56:52 AM IST 
//


package com.earthport.bind.v2.getPayerIdentity;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.earthport.bind.v2.common.core.UserIDType;
import com.earthport.bind.v2.common.identitybase.PayerIdentityIDType;


/**
 * <p>Java class for getPayerIdentityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPayerIdentityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="userID" type="{http://customer.endpoint.earthport.com/api/merchant/v2/components/core}UserIDType"/>
 *             &lt;element name="showHistory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;element name="payerIdentityID" type="{http://customer.endpoint.earthport.com/api/merchant/v2/components/identityBase}PayerIdentityIDType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPayerIdentityType", propOrder = {
    "userID",
    "showHistory",
    "payerIdentityID"
})
public class GetPayerIdentityType {

    protected UserIDType userID;
    protected Boolean showHistory;
    protected PayerIdentityIDType payerIdentityID;
    @XmlAttribute(name = "version", required = true)
    protected BigDecimal version;

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link UserIDType }
     *     
     */
    public UserIDType getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserIDType }
     *     
     */
    public void setUserID(UserIDType value) {
        this.userID = value;
    }

    /**
     * Gets the value of the showHistory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowHistory() {
        return showHistory;
    }

    /**
     * Sets the value of the showHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowHistory(Boolean value) {
        this.showHistory = value;
    }

    /**
     * Gets the value of the payerIdentityID property.
     * 
     * @return
     *     possible object is
     *     {@link PayerIdentityIDType }
     *     
     */
    public PayerIdentityIDType getPayerIdentityID() {
        return payerIdentityID;
    }

    /**
     * Sets the value of the payerIdentityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayerIdentityIDType }
     *     
     */
    public void setPayerIdentityID(PayerIdentityIDType value) {
        this.payerIdentityID = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVersion(BigDecimal value) {
        this.version = value;
    }

}