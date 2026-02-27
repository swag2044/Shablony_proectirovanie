import java.util.ArrayList;
import java.util.List;

public class CurrencyExchange implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private double rate;
    private String currency;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
        System.out.println("Наблюдатель добавлен");
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        System.out.println("Наблюдатель удален");
    }

    public void setRate(String currency, double rate) {
        this.currency = currency;
        this.rate = rate;
        notifyObservers(currency, rate);
    }

    @Override
    public void notifyObservers(String currency, double rate) {
        for (Observer observer : observers) {
            observer.update(currency, rate);
        }
    }
}