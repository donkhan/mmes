package transport;

import soap.BaseSOAP;
import play.libs.WS;
import play.libs.WS.*;
import play.Logger;
import javax.xml.soap.SOAPMessage;

/**
 * Created by kkhan on 24/04/18.
 */
public class ExecuteSOAPMessage {

    public static String execute(SOAPMessage soapMessage,String endPoint){
        String scheme = "http";
        String server = "101.99.73.46";
        String port = "2001";
        try{
            HttpResponse response = WS.url(scheme+"://" + server + ":" + port + "/" + endPoint).setHeader("SOAPAction","").
                    setHeader("Content-Type","text/xml").body(BaseSOAP.printSoapMessage(soapMessage)).post();
            Logger.debug("Http Response Status " + response.getStatus());
            String r = response.getString();
            Logger.debug("Response " + r);
            return r;
        }catch(Throwable e){
        }
        return null;
    }
}
