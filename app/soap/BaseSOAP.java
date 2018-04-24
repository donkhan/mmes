package soap;

import sun.misc.BASE64Encoder;

import javax.xml.soap.*;
import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Formatter;

/**
 * Created by kkhan on 24/04/18.
 */
public abstract class BaseSOAP {

    private static String getCreatedAt(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.S'Z'");
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
        String sha1 = encryptPassword(x);
        String base64encoded = new BASE64Encoder().encode(sha1.getBytes());
        return password;
    }

    private static String getNonce(){
        String nonce = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(4).toUpperCase();
        return nonce;
    }

    protected void addSOAPHeader(SOAPEnvelope envelope, SOAPHeader header) throws SOAPException {
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

    public static String printSoapMessage(final SOAPMessage soapMessage) throws TransformerFactoryConfigurationError,
            TransformerConfigurationException, SOAPException, TransformerException {
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

    public abstract void addSOAPBody(SOAPEnvelope envelope) throws SOAPException;
    public SOAPMessage construct(){
        try {
            MessageFactory factory = MessageFactory.newInstance(SOAPConstants.DEFAULT_SOAP_PROTOCOL);
            SOAPMessage soapMsg = factory.createMessage();
            SOAPPart part = soapMsg.getSOAPPart();
            SOAPEnvelope envelope = part.getEnvelope();
            envelope.setAttribute("xmlns:v1","http://customer.endpoint.earthport.com/api/merchant/v1");
            addSOAPHeader(envelope,soapMsg.getSOAPHeader());
            addSOAPBody(envelope);
            play.Logger.debug(printSoapMessage(soapMsg));
            return soapMsg;
        }catch(Throwable t){
            t.printStackTrace();
        }
        return null;
    }
}
