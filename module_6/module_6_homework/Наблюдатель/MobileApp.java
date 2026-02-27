public class MobileApp implements Observer {

    @Override
    public void update(String currency, double rate) {
        System.out.println("📱 Уведомление в мобильном приложении: "
                + currency + " курс изменился до " + rate);
    }
}