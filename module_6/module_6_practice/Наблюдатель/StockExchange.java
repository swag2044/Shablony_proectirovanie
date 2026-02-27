import java.util.*;

public class StockExchange implements Subject {

    private Map<String, List<Observer>> observers = new HashMap<>();
    private Map<String, Double> stocks = new HashMap<>();

    public void addStock(String stock, double price) {
        stocks.put(stock, price);
        observers.put(stock, new ArrayList<>());
    }

    public void changePrice(String stock, double newPrice) {

        if (!stocks.containsKey(stock)) {
            System.out.println("Акция не найдена");
            return;
        }

        stocks.put(stock, newPrice);
        notifyObservers(stock, newPrice);
    }

    @Override
    public void subscribe(String stock, Observer observer) {
        if (observers.containsKey(stock)) {
            observers.get(stock).add(observer);
            System.out.println("Подписка добавлена на " + stock);
        }
    }

    @Override
    public void unsubscribe(String stock, Observer observer) {
        if (observers.containsKey(stock)) {
            observers.get(stock).remove(observer);
            System.out.println("Отписка от " + stock);
        }
    }

    @Override
    public void notifyObservers(String stock, double price) {
        for (Observer observer : observers.get(stock)) {
            observer.update(stock, price);
        }
    }
}