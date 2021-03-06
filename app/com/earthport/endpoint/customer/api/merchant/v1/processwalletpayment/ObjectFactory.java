//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.20 at 07:56:52 AM IST 
//


package com.earthport.endpoint.customer.api.merchant.v1.processwalletpayment;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.earthport.endpoint.customer.api.merchant.v1.processwalletpayment package. 
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

    private final static QName _ProcessWalletPayment_QNAME = new QName("http://customer.endpoint.earthport.com/api/merchant/v1/processWalletPayment", "processWalletPayment");
    private final static QName _ProcessWalletPaymentResponse_QNAME = new QName("http://customer.endpoint.earthport.com/api/merchant/v1/processWalletPayment", "processWalletPaymentResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.earthport.endpoint.customer.api.merchant.v1.processwalletpayment
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProcessWalletPaymentResponseType }
     * 
     */
    public ProcessWalletPaymentResponseType createProcessWalletPaymentResponseType() {
        return new ProcessWalletPaymentResponseType();
    }

    /**
     * Create an instance of {@link ProviderWalletDetailsType }
     * 
     */
    public ProviderWalletDetailsType createProviderWalletDetailsType() {
        return new ProviderWalletDetailsType();
    }

    /**
     * Create an instance of {@link ProcessWalletPaymentType }
     * 
     */
    public ProcessWalletPaymentType createProcessWalletPaymentType() {
        return new ProcessWalletPaymentType();
    }

    /**
     * Create an instance of {@link BeneficiaryAmountInformationType }
     * 
     */
    public BeneficiaryAmountInformationType createBeneficiaryAmountInformationType() {
        return new BeneficiaryAmountInformationType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessWalletPaymentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://customer.endpoint.earthport.com/api/merchant/v1/processWalletPayment", name = "processWalletPayment")
    public JAXBElement<ProcessWalletPaymentType> createProcessWalletPayment(ProcessWalletPaymentType value) {
        return new JAXBElement<ProcessWalletPaymentType>(_ProcessWalletPayment_QNAME, ProcessWalletPaymentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessWalletPaymentResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://customer.endpoint.earthport.com/api/merchant/v1/processWalletPayment", name = "processWalletPaymentResponse")
    public JAXBElement<ProcessWalletPaymentResponseType> createProcessWalletPaymentResponse(ProcessWalletPaymentResponseType value) {
        return new JAXBElement<ProcessWalletPaymentResponseType>(_ProcessWalletPaymentResponse_QNAME, ProcessWalletPaymentResponseType.class, null, value);
    }

}
