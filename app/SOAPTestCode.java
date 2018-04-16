import javax.xml.namespace.QName;
import javax.xml.soap.*;

/**
 * Created by kkhan on 16/04/18.
 */
public class SOAPTestCode {

    public static void main(String args[]){
        try {
            MessageFactory factory = MessageFactory.newInstance(SOAPConstants.DEFAULT_SOAP_PROTOCOL);
            SOAPMessage soapMsg = factory.createMessage();
            SOAPPart part = soapMsg.getSOAPPart();
            SOAPEnvelope envelope = part.getEnvelope();
            SOAPHeader header = envelope.getHeader();


            SOAPHeaderElement security = (SOAPHeaderElement)header.addChildElement("Security", "wsse", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");
            security.setMustUnderstand(true);

            SOAPElement usernameToken = security.addChildElement("UsernameToken","wsse");
            usernameToken.addAttribute(new QName("wsu","Id"),"UsernameToken-9CDC29E8F0E9EE9369152326691084057");
            SOAPElement userName = usernameToken.addChildElement("Username","wsse");
            userName.addTextNode("USERNAME");

            SOAPElement passWord = usernameToken.addChildElement("Password","wsse");
            passWord.addTextNode("PASSWORD");
            SOAPBody body = envelope.getBody();

            QName bodyName = new QName("", "submitDocument", "v1");
            SOAPBodyElement bodyElement = body.addBodyElement(bodyName);

            QName name = new QName("parameters");
            SOAPElement parameters = bodyElement.addChildElement(name);
            QName q = new QName("http://customer.endpoint.earthport.com/api/merchant/v1/services/createOrUpdateUser",
                    "createOrUpdateUser","ns2");
            SOAPElement co = parameters.addChildElement(q);

            co.setAttribute("xmlns:ns","http://customer.endpoint.earthport.com/api/merchant/v2/components/core");
            co.setAttribute("xmlns:ns3","http://customer.endpoint.earthport.com/api/merchant/v2/components/identityBase");
            co.setAttribute("version","1.0");

            SOAPElement mui = parameters.addChildElement(new QName("merchantUserIdentity","merchantUserIdentity","ns2"));
            mui.setTextContent("test_user343");
            /*
            SOAPElement currency = parameters.addChildElement(new QName("ns2","accountCurrency"));
            currency.setTextContent("GBP");
            SOAPElement payerIdentity = parameters.addChildElement(new QName("ns2","accountCurrency"));

            SOAPElement payerIndividiualIdentity = payerIdentity.addChildElement(new QName("ns3",""));
            System.out.println(co);
            */
            soapMsg.writeTo(System.out);
        }catch(Throwable t){
            t.printStackTrace();
        }

    }

}
