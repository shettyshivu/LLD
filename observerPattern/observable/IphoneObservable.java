package observable;

import observer.NotificationAlertObserver;

import java.util.*;

public class IphoneObservable implements StocksObservable{
    public List<NotificationAlertObserver> observerList = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void addObserver(NotificationAlertObserver observer){
        observerList.add(observer);
    }

    @Override
    public void removeObserver(NotificationAlertObserver observer){
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers(){
        for(NotificationAlertObserver observer : observerList){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int stockCount){
        if(this.stockCount == 0){
            notifySubscribers();
        }
        this.stockCount = stockCount;
    }

    @Override
    public int getStockCount(){
        return stockCount;
    }
}
