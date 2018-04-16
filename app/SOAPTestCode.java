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
            SOAPElement co = parameters.addChildElement(new QName("ns2","createOrUpdateUser"));
            co.setAttribute("version","1.0");

            SOAPElement mui = co.addChildElement(new QName("ns2","merchantUserIdentity"));
            mui.setTextContent("test_user343");

            soapMsg.writeTo(System.out);


        }catch(Throwable t){
            t.printStackTrace();
        }

    }

}
