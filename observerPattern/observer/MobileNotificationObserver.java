package observer;

import observable.StocksObservable;

public class MobileNotificationObserver implements NotificationAlertObserver{
    String mobileNumber;
    StocksObservable observable;

    public MobileNotificationObserver(String mobileNumber, StocksObservable observable){
        this.mobileNumber = mobileNumber;
        this.observable = observable;
    }

    @Override
    public void update(){
        shortMessageService(mobileNumber, "Hurry up!, product is in stock");
    }

    public void shortMessageService(String mobileNumber, String message){
        System.out.println("Message sent to "+mobileNumber);
    }
}
