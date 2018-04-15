package controllers;

import play.mvc.Controller;

import javax.xml.soap.*;
import javax.xml.namespace.*;

public class Application extends Controller {

    public static void index() {
        try {
            MessageFactory factory = MessageFactory.newInstance(SOAPConstants.DEFAULT_SOAP_PROTOCOL);
            SOAPMessage soapMsg = factory.createMessage();
            SOAPPart part = soapMsg.getSOAPPart();
            SOAPEnvelope envelope = part.getEnvelope();
            SOAPHeader header = envelope.getHeader();
            SOAPBody body = envelope.getBody();

            QName bodyName = new QName("", "submitDocument", "v1");
            SOAPBodyElement bodyElement = body.addBodyElement(bodyName);

            QName name = new QName("parameters");
            SOAPElement parameters = bodyElement.addChildElement(name);


            soapMsg.writeTo(System.out);

        }catch(Throwable t){
            t.printStackTrace();
        }
        render();
    }

}