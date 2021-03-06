//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.20 at 07:56:52 AM IST 
//


package com.earthport.bind.v2.validateCredit;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.earthport.bind.v2.validateCredit package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ValidateCredit_QNAME = new QName("http://customer.endpoint.earthport.com/api/merchant/v2/services/validateCredit", "validateCredit");
    private final static QName _ValidateCreditResponse_QNAME = new QName("http://customer.endpoint.earthport.com/api/merchant/v2/services/validateCredit", "validateCreditResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.earthport.bind.v2.validateCredit
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidateCreditResponseType }
     * 
     */
    public ValidateCreditResponseType createValidateCreditResponseType() {
        return new ValidateCreditResponseType();
    }

    /**
     * Create an instance of {@link ValidateCreditType }
     * 
     */
    public ValidateCreditType createValidateCreditType() {
        return new ValidateCreditType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateCreditType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://customer.endpoint.earthport.com/api/merchant/v2/services/validateCredit", name = "validateCredit")
    public JAXBElement<ValidateCreditType> createValidateCredit(ValidateCreditType value) {
        return new JAXBElement<ValidateCreditType>(_ValidateCredit_QNAME, ValidateCreditType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateCreditResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://customer.endpoint.earthport.com/api/merchant/v2/services/validateCredit", name = "validateCreditResponse")
    public JAXBElement<ValidateCreditResponseType> createValidateCreditResponse(ValidateCreditResponseType value) {
        return new JAXBElement<ValidateCreditResponseType>(_ValidateCreditResponse_QNAME, ValidateCreditResponseType.class, null, value);
    }

}
