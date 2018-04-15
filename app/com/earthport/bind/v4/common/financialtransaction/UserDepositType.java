//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.20 at 07:56:52 AM IST 
//


package com.earthport.bind.v4.common.financialtransaction;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.earthport.bind.v2.common.core.UserIDType;


/**
 * 
 * 				A financial transaction representing money paid into a merchant's account by a user.
 * 			
 * 
 * <p>Java class for UserDepositType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserDepositType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://customer.endpoint.earthport.com/api/merchant/v4/components/financialTransactionBase}FinancialTransactionType">
 *       &lt;sequence>
 *         &lt;element name="userID" type="{http://customer.endpoint.earthport.com/api/merchant/v2/components/core}UserIDType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserDepositType", propOrder = {
    "userID"
})
@XmlSeeAlso({
    UserDepositDetailType.class
})
public class UserDepositType
    extends FinancialTransactionType
{

    @XmlElement(required = true)
    protected UserIDType userID;

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

}
