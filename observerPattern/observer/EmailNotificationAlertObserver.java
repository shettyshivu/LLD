package observer;

import java.util.*;
import observable.StocksObservable;

public class EmailNotificationAlertObserver implements NotificationAlertObserver{
    String emailId;
    StocksObservable observable;

    public EmailNotificationAlertObserver(String emailId, StocksObservable observable){
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update(){
        sendMail(emailId, "Hurry up!, product is in stock");
    }

    public void sendMail(String emailId, String message){
        System.out.println("Message sent to "+ emailId);
    }
}
