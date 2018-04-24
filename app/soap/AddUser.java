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
                "createOrUpdateUser","ns1"));
        co.setAttribute("xmlns:ns","http://customer.endpoint.earthport.com/api/merchant/v2/components/core");
        co.setAttribute("xmlns:ns2","http://customer.endpoint.earthport.com/api/merchant/v2/components/identityBase");
        co.setAttribute("version","1.0");
        SOAPElement mui = co.addChildElement("merchantUserIdentity","ns1");
        mui.setTextContent("test_user343");
        SOAPElement currency = co.addChildElement("accountCurrency","ns1");
        currency.setTextContent("GBP");

        SOAPElement payerIdentity = co.addChildElement("payerIdentity","ns1");
        SOAPElement payerIndividiualIdentity = payerIdentity.addChildElement(
                "payerIndividualIdentity","ns2");
        SOAPElement name = payerIndividiualIdentity.addChildElement("name","ns2");
        name.addChildElement("givenNames","ns2").setTextContent("Donald");
        name.addChildElement("familyName","ns2").setTextContent("Trump");


        SOAPElement address = payerIndividiualIdentity.addChildElement("address","ns2");
        address.addChildElement("addressLine1","ns2").setTextContent("13th Cross");
        address.addChildElement("addressLine2","ns2").setTextContent("Wilson Garden");
        address.addChildElement("city","ns2").setTextContent("Bangalore");
        address.addChildElement("country","ns2").setTextContent("IN");

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
