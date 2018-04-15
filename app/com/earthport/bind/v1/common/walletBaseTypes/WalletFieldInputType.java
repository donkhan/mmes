//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.20 at 07:56:52 AM IST 
//


package com.earthport.bind.v1.common.walletBaseTypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for walletFieldInputType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="walletFieldInputType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="text"/>
 *     &lt;enumeration value="list"/>
 *     &lt;enumeration value="integer"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "walletFieldInputType")
@XmlEnum
public enum WalletFieldInputType {

    @XmlEnumValue("text")
    TEXT("text"),
    @XmlEnumValue("list")
    LIST("list"),
    @XmlEnumValue("integer")
    INTEGER("integer");
    private final String value;

    WalletFieldInputType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WalletFieldInputType fromValue(String v) {
        for (WalletFieldInputType c: WalletFieldInputType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
