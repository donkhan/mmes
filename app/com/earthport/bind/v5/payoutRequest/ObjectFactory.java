//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.20 at 07:56:52 AM IST 
//


package com.earthport.bind.v5.payoutRequest;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.earthport.bind.v5.payoutRequest package. 
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

    private final static QName _PayoutRequest_QNAME = new QName("http://customer.endpoint.earthport.com/api/merchant/v5/services/payoutRequest", "payoutRequest");
    private final static QName _PayoutRequestResponse_QNAME = new QName("http://customer.endpoint.earthport.com/api/merchant/v5/services/payoutRequest", "payoutRequestResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.earthport.bind.v5.payoutRequest
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BeneficiaryAmountInformationType }
     * 
     */
    public BeneficiaryAmountInformationType createBeneficiaryAmountInformationType() {
        return new BeneficiaryAmountInformationType();
    }

    /**
     * Create an instance of {@link PayoutRequestResponseType }
     * 
     */
    public PayoutRequestResponseType createPayoutRequestResponseType() {
        return new PayoutRequestResponseType();
    }

    /**
     * Create an instance of {@link PayoutRequestType }
     * 
     */
    public PayoutRequestType createPayoutRequestType() {
        return new PayoutRequestType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayoutRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://customer.endpoint.earthport.com/api/merchant/v5/services/payoutRequest", name = "payoutRequest")
    public JAXBElement<PayoutRequestType> createPayoutRequest(PayoutRequestType value) {
        return new JAXBElement<PayoutRequestType>(_PayoutRequest_QNAME, PayoutRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayoutRequestResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://customer.endpoint.earthport.com/api/merchant/v5/services/payoutRequest", name = "payoutRequestResponse")
    public JAXBElement<PayoutRequestResponseType> createPayoutRequestResponse(PayoutRequestResponseType value) {
        return new JAXBElement<PayoutRequestResponseType>(_PayoutRequestResponse_QNAME, PayoutRequestResponseType.class, null, value);
    }

}
