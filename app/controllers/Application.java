package controllers;

import play.mvc.Controller;
import javax.xml.soap.SOAPMessage;

import soap.AddUser;
import soap.MakePayment;
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


    public static void makePayment() {
        MakePayment mp = new MakePayment();
        SOAPMessage soapMessage = mp.construct();
        String s = ExecuteSOAPMessage.execute(soapMessage, "earthport/MerchantAPI");
        renderText(s);
    }
}