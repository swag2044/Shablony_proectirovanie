public class MainObserver {

    public static void main(String[] args) {

        CurrencyExchange exchange = new CurrencyExchange();

        Observer trader = new Trader("Olzhas");
        Observer mobileApp = new MobileApp();
        Observer autoSystem = new AutomatedSystem();

        exchange.addObserver(trader);
        exchange.addObserver(mobileApp);
        exchange.addObserver(autoSystem);

        exchange.setRate("USD", 480);
        exchange.setRate("EUR", 520);

        exchange.removeObserver(mobileApp);

        exchange.setRate("USD", 510);
    }
}