public class AutomatedSystem implements Observer {

    @Override
    public void update(String currency, double rate) {
        if (rate > 500) {
            System.out.println("🤖 Автосистема: продаем " + currency);
        } else {
            System.out.println("🤖 Автосистема: покупаем " + currency);
        }
    }
}