import observable.IphoneObservable;
import observable.*;
import observer.*;

class Store{
    public static void main(String[] args) {
        StocksObservable iphoneStocksObservable = new IphoneObservable();
        
        NotificationAlertObserver observer1 = new EmailNotificationAlertObserver("Shivaprasadshetty555gmail.com", iphoneStocksObservable);
        NotificationAlertObserver observer2 = new EmailNotificationAlertObserver("Shivaprasadshetty555gmail.com", iphoneStocksObservable);
        NotificationAlertObserver observer3 = new MobileNotificationObserver("+919353472654", iphoneStocksObservable);

        iphoneStocksObservable.addObserver(observer1);
        iphoneStocksObservable.addObserver(observer2);
        iphoneStocksObservable.addObserver(observer3);

        iphoneStocksObservable.setStockCount(10);
    }
}