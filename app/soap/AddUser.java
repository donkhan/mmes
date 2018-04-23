package soap;

import javax.xml.namespace.QName;
import javax.xml.soap.*;

/**
 * Created by kkhan on 24/04/18.
 */
public class AddUser extends BaseSOAP{

    private void addSOAPBody(SOAPEnvelope envelope,SOAPHeader header) throws SOAPException{
        SOAPBody body = envelope.getBody();
        QName bodyName = new QName("", "submitDocument", "v1");
        SOAPBodyElement bodyElement = body.addBodyElement(bodyName);
        SOAPElement parameters = bodyElement.addChildElement(new QName("parameters"));
        SOAPElement co = parameters.addChildElement(new QName("http://customer.endpoint.earthport.com/api/merchant/v1/services/createOrUpdateUser",
                "createOrUpdateUser","ns2"));
        co.setAttribute("xmlns:ns","http://customer.endpoint.earthport.com/api/merchant/v2/components/core");
        co.setAttribute("xmlns:ns3","http://customer.endpoint.earthport.com/api/merchant/v2/components/identityBase");
        co.setAttribute("version","1.0");
        SOAPElement mui = co.addChildElement("merchantUserIdentity","ns2");
        mui.setTextContent("test_user343");
        SOAPElement currency = co.addChildElement("accountCurrency","ns2");
        currency.setTextContent("GBP");

        /*
        SOAPElement payerIdentity = parameters.addChildElement(new QName("payerIdentity","payerIdentity","ns2"));
        SOAPElement payerIndividiualIdentity = payerIdentity.addChildElement(new QName("payerIndividualIdentity",
                "payerIndividualIdentity","ns3"));
        SOAPElement name = payerIndividiualIdentity.addChildElement(new QName("name","name","ns3"));
        name.addChildElement(new QName("givenNames","givenNames","ns3")).setTextContent("Donald");
        name.addChildElement(new QName("familyName","familyName","ns3")).setTextContent("Trump");

        SOAPElement address = payerIndividiualIdentity.addChildElement(new QName("address","address","ns3"));
        address.addChildElement(new QName("addressLine1","addressLine1","ns3")).setTextContent("13th Cross");
        address.addChildElement(new QName("addressLine2","addressLine2","ns3")).setTextContent("Wilson Garden");
        address.addChildElement(new QName("city","city","ns3")).setTextContent("Bangalore");
        address.addChildElement(new QName("country","country","ns3")).setTextContent("IN");
        co.addChildElement(payerIdentity);
        */
    }

    public SOAPMessage construct(){
        try {
            MessageFactory factory = MessageFactory.newInstance(SOAPConstants.DEFAULT_SOAP_PROTOCOL);
            SOAPMessage soapMsg = factory.createMessage();
            SOAPPart part = soapMsg.getSOAPPart();
            SOAPEnvelope envelope = part.getEnvelope();
            envelope.setAttribute("xmlns:v1","http://customer.endpoint.earthport.com/api/merchant/v1");
            addSOAPHeader(envelope,soapMsg.getSOAPHeader());
            addSOAPBody(envelope,soapMsg.getSOAPHeader());
            play.Logger.debug(printSoapMessage(soapMsg));
            return soapMsg;
        }catch(Throwable t){
            t.printStackTrace();
        }
        return null;
    }

}
