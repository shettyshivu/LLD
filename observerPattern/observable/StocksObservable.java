package observable;

import observer.NotificationAlertObserver;

public interface StocksObservable {
    public void addObserver(NotificationAlertObserver observer);
    public void removeObserver(NotificationAlertObserver observer);
    public void notifySubscribers();
    public void setStockCount(int count);
    public int getStockCount();
}
