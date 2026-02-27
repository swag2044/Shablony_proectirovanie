public class MainObserver {

    public static void main(String[] args) {

        StockExchange exchange = new StockExchange();

        exchange.addStock("AAPL", 150);
        exchange.addStock("TSLA", 250);

        Trader trader = new Trader("Olzhas");
        TradingRobot robot = new TradingRobot(200);

        exchange.subscribe("AAPL", trader);
        exchange.subscribe("TSLA", robot);

        exchange.changePrice("AAPL", 170);
        exchange.changePrice("TSLA", 180);
        exchange.changePrice("TSLA", 300);
    }
}