//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.20 at 07:56:52 AM IST 
//


package com.earthport.bind.v3.getFXQuote;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.earthport.bind.v3.getFXQuote package. 
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

    private final static QName _GetFXQuote_QNAME = new QName("http://customer.endpoint.earthport.com/api/merchant/v3/services/getFXQuote", "getFXQuote");
    private final static QName _GetFXQuoteResponse_QNAME = new QName("http://customer.endpoint.earthport.com/api/merchant/v3/services/getFXQuote", "getFXQuoteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.earthport.bind.v3.getFXQuote
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetFXQuoteResponseType }
     * 
     */
    public GetFXQuoteResponseType createGetFXQuoteResponseType() {
        return new GetFXQuoteResponseType();
    }

    /**
     * Create an instance of {@link GetFXQuoteType }
     * 
     */
    public GetFXQuoteType createGetFXQuoteType() {
        return new GetFXQuoteType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFXQuoteType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://customer.endpoint.earthport.com/api/merchant/v3/services/getFXQuote", name = "getFXQuote")
    public JAXBElement<GetFXQuoteType> createGetFXQuote(GetFXQuoteType value) {
        return new JAXBElement<GetFXQuoteType>(_GetFXQuote_QNAME, GetFXQuoteType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFXQuoteResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://customer.endpoint.earthport.com/api/merchant/v3/services/getFXQuote", name = "getFXQuoteResponse")
    public JAXBElement<GetFXQuoteResponseType> createGetFXQuoteResponse(GetFXQuoteResponseType value) {
        return new JAXBElement<GetFXQuoteResponseType>(_GetFXQuoteResponse_QNAME, GetFXQuoteResponseType.class, null, value);
    }

}
