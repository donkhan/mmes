package soap;

import javax.xml.namespace.QName;
import javax.xml.soap.*;

/**
 * Created by kkhan on 24/04/18.
 */
public class AddUser extends BaseSOAP{

    public void addSOAPBody(SOAPEnvelope envelope) throws SOAPException{
        SOAPBody body = envelope.getBody();
        QName bodyName = new QName("", "submitDocument", "v1");
        SOAPBodyElement bodyElement = body.addBodyElement(bodyName);
        SOAPElement parameters = bodyElement.addChildElement(new QName("parameters"));
        SOAPElement createOrUpdateRequest = parameters.addChildElement(new QName("http://customer.endpoint.earthport.com/api/merchant/v1/services/createOrUpdateUser",
                "createOrUpdateUser","cour"));
        createOrUpdateRequest.setAttribute("xmlns:ns","http://customer.endpoint.earthport.com/api/merchant/v2/components/core");
        createOrUpdateRequest.setAttribute("xmlns:pii","http://customer.endpoint.earthport.com/api/merchant/v2/components/identityBase");
        createOrUpdateRequest.setAttribute("version","1.0");
        SOAPElement mui = createOrUpdateRequest.addChildElement("merchantUserIdentity","cour");
        mui.setTextContent("test_user343");
        SOAPElement currency = createOrUpdateRequest.addChildElement("accountCurrency","cour");
        currency.setTextContent("GBP");
        SOAPElement payerIdentity = createOrUpdateRequest.addChildElement("payerIdentity","cour");
        SOAPElement payerIndividiualIdentity = payerIdentity.addChildElement(
                "payerIndividualIdentity","pii");
        SOAPElement name = payerIndividiualIdentity.addChildElement("name","pii");
        name.addChildElement("givenNames","pii").setTextContent("Donald");
        name.addChildElement("familyName","pii").setTextContent("Trump");
        SOAPElement address = payerIndividiualIdentity.addChildElement("address","pii");
        address.addChildElement("addressLine1","pii").setTextContent("13th Cross");
        address.addChildElement("addressLine2","pii").setTextContent("Wilson Garden");
        address.addChildElement("city","pii").setTextContent("Bangalore");
        address.addChildElement("country","pii").setTextContent("IN");
    }



}
