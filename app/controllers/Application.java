package controllers;

import play.mvc.Controller;
import javax.xml.soap.SOAPMessage;

import soap.AddUser;
import transport.ExecuteSOAPMessage;

public class Application extends Controller {

    public static void index() {
        render();
    }

    public static void addUser() {
        AddUser addUser = new AddUser();
        SOAPMessage soapMessage = addUser.construct();
        String s = ExecuteSOAPMessage.execute(soapMessage, "earthport/MerchantAPI");
        renderText(s);
    }

}