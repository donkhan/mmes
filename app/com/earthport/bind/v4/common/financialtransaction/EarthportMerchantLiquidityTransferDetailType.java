//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.20 at 07:56:52 AM IST 
//


package com.earthport.bind.v4.common.financialtransaction;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Financial transaction representing the transfer of liquidity from an
 *                 Earthport account to a Merchants Central account.
 *                 This element contains all details pertaining to this financial transaction.
 *             
 * 
 * <p>Java class for EarthportMerchantLiquidityTransferDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EarthportMerchantLiquidityTransferDetailType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://customer.endpoint.earthport.com/api/merchant/v4/components/financialTransactionBase}EarthportMerchantLiquidityTransferType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EarthportMerchantLiquidityTransferDetailType")
public class EarthportMerchantLiquidityTransferDetailType
    extends EarthportMerchantLiquidityTransferType
{


}
