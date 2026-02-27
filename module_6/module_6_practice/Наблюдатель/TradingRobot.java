public class TradingRobot implements Observer {

    private double threshold;

    public TradingRobot(double threshold) {
        this.threshold = threshold;
    }

    @Override
    public void update(String stock, double price) {

        if (price > threshold) {
            System.out.println("Робот продает " + stock);
        } else {
            System.out.println("Робот покупает " + stock);
        }
    }
}