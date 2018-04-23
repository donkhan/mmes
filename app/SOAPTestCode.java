import javax.xml.namespace.*;
import javax.xml.soap.*;

import com.earthport.bind.v1.createOrUpdateUser.CreateOrUpdateUserType;
import sun.misc.BASE64Encoder;
import java.io.*;
import javax.xml.transform.*;
import javax.xml.transform.stream.*;
import java.text.*;
import java.security.*;
import java.util.*;
import play.libs.WS;
import play.libs.WS.*;
import javax.xml.bind.*;
/**
 * Created by kkhan on 16/04/18.
 */
public class SOAPTestCode {


    private static String getCreatedAt(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.S'Z'");
        //System.out.println(sdf.format(new java.util.Date()));
        //System.out.println("2018-04-09T09:41:50.840Z");
        return sdf.format(new java.util.Date());
    }

    private static String getUserName(){
        return "MaxMoney";
    }

    private static String encryptPassword(String password){
        String sha1 = "";
        try{
            MessageDigest crypt = MessageDigest.getInstance("SHA-1");
            crypt.reset();
            crypt.update(password.getBytes("UTF-8"));
            sha1 = byteToHex(crypt.digest());
        }
        catch(NoSuchAlgorithmException e){
            e.printStackTrace();
        }
        catch(UnsupportedEncodingException e){
            e.printStackTrace();
        }
        return sha1;
    }

    private static String byteToHex(final byte[] hash){
        Formatter formatter = new Formatter();
        for (byte b : hash){
            formatter.format("%02x", b);
        }
        String result = formatter.toString();
        formatter.close();
        return result;
    }

    private static String getPassword(String nonce,String created){
        String password = "gEQypcOSiBfF";
        String  x = nonce + created + password;
        System.out.println("Clear Text Password " + x);
        String sha1 = encryptPassword(x);
        String base64encoded = new BASE64Encoder().encode(sha1.getBytes());
        System.out.println("sha1 = " + sha1);
        System.out.println("Encoded = " + base64encoded);
        //return base64encoded;
        return password;
    }

    private static String getNonce(){
        String nonce = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(4).toUpperCase();
        System.out.println("Nonce = " + nonce);
        return nonce;
    }

    private static void addSOAPHeader(SOAPEnvelope envelope,SOAPHeader header) throws SOAPException{
        SOAPHeaderElement security = (SOAPHeaderElement)header.addChildElement("Security", "wsse", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");
        security.setMustUnderstand(true);
        security.setAttribute("xmlns:wsu", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");

        SOAPElement userNameTokenElement = security.addChildElement(envelope.createName("UsernameToken", "wsse",
                "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd"));
        userNameTokenElement.setAttribute("wsu:Id","UsernameToken-9CDC29E8F0E9EE9369152326691084057");

        String nonce = getNonce();
        String created = getCreatedAt();
        String userName = getUserName();
        String passWord = getPassword(nonce,created);

        SOAPElement userNameElement = userNameTokenElement.addChildElement(envelope.createName("Username", "wsse",
                "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd"));
        userNameElement.setTextContent(userName);
        SOAPElement passwordElement = userNameTokenElement.addChildElement(envelope.createName("Password", "wsse",
                "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd"));
        passwordElement.setTextContent(passWord);
        passwordElement.setAttribute("Type","http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText");

        SOAPElement nonceElement = userNameTokenElement.addChildElement(envelope.createName("Nonce", "wsse",
                "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd"));
        nonceElement.setTextContent(nonce);
        nonceElement.setAttribute("EncodingType","http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-soap-message-security-1.0#Base64Binary");

        SOAPElement createdElement = userNameTokenElement.addChildElement(envelope.createName("created", "wsse",
                "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd"));
        createdElement.setTextContent(created);
    }

    private static void addSOAPBody(SOAPEnvelope envelope,SOAPHeader header) throws SOAPException{
        CreateOrUpdateUserType cot = new CreateOrUpdateUserType();
        cot.setMerchantUserIdentity("EETTE");
        cot.setAccountCurrency("GBP");
        printS(cot);


        SOAPBody body = envelope.getBody();
        QName bodyName = new QName("", "submitDocument", "v1");
        SOAPBodyElement bodyElement = body.addBodyElement(bodyName);
        SOAPElement parameters = bodyElement.addChildElement(new QName("parameters"));
        SOAPElement co = parameters.addChildElement(new QName("http://customer.endpoint.earthport.com/api/merchant/v1/services/createOrUpdateUser",
                "createOrUpdateUser","ns2"));

        co.setAttribute("xmlns:ns","http://customer.endpoint.earthport.com/api/merchant/v2/components/core");
        co.setAttribute("xmlns:ns3","http://customer.endpoint.earthport.com/api/merchant/v2/components/identityBase");
        co.setAttribute("version","1.0");

        SOAPElement currency = parameters.addChildElement(new QName("accountCurrency","accountCurrency","ns2"));
        currency.setTextContent("GBP");


        SOAPElement mui = parameters.addChildElement(new QName("merchantUserIdentity","merchantUserIdentity","ns2"));
        mui.setTextContent("test_user343");
        co.addChildElement(mui);
        co.addChildElement(currency);

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
    }

    public static void printS(Object o){
        try {
            JAXBContext context = JAXBContext.newInstance(CreateOrUpdateUserType.class);
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            final ByteArrayOutputStream streamOut = new ByteArrayOutputStream();
            final StreamResult result = new StreamResult(streamOut);
            m.marshal(o,result);
            System.out.println(streamOut.toString());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]){
        try {
            MessageFactory factory = MessageFactory.newInstance(SOAPConstants.DEFAULT_SOAP_PROTOCOL);
            SOAPMessage soapMsg = factory.createMessage();
            SOAPPart part = soapMsg.getSOAPPart();
            SOAPEnvelope envelope = part.getEnvelope();
            envelope.setAttribute("xmlns:v1","http://customer.endpoint.earthport.com/api/merchant/v1");
            addSOAPHeader(envelope,soapMsg.getSOAPHeader());
            addSOAPBody(envelope,soapMsg.getSOAPHeader());
            System.out.println(printSoapMessage(soapMsg));
            sendToProxyServer(soapMsg);
           // WSRequest request = WS.url("http://linuxbox:567");
        }catch(Throwable t){
            t.printStackTrace();
        }
    }

    private static void sendToProxyServer(SOAPMessage soapMessage){
        String host = "101.99.73.46";
        String port = "2001";
        String scheme = "http";
        String endpoint = "earthport/MerchantAPI";
        String url = scheme  + "://" + host + ":" + port + "/" + endpoint;
        System.out.println(url);

        try{
            System.out.println("Going to create Request...");
            WSRequest request = WS.url("http://101.99.73.46:2001/earthport/MerchantAPI");
            System.out.println("Request is created");
            request.setHeader("SOAPAction","").setHeader("Content-Type","text/xml");
            request.body(printSoapMessage(soapMessage));
            System.out.println("Body is set");
            HttpResponse response = request.post();

            System.out.println("Response status " + response.getStatus());
        }catch(Throwable t){
            t.printStackTrace();
        }
    }

    private static String printSoapMessage(final SOAPMessage soapMessage) throws TransformerFactoryConfigurationError,
            TransformerConfigurationException, SOAPException, TransformerException{
        final TransformerFactory transformerFactory = TransformerFactory.newInstance();
        final Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
        final Source soapContent = soapMessage.getSOAPPart().getContent();
        final ByteArrayOutputStream streamOut = new ByteArrayOutputStream();
        final StreamResult result = new StreamResult(streamOut);
        transformer.transform(soapContent, result);
        return streamOut.toString();
    }

}
