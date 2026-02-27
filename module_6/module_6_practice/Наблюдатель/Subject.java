public interface Subject {
    void subscribe(String stock, Observer observer);
    void unsubscribe(String stock, Observer observer);
    void notifyObservers(String stock, double price);
}