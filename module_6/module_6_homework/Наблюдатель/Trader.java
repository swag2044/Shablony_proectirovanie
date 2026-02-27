public class Trader implements Observer {

    private String name;

    public Trader(String name) {
        this.name = name;
    }

    @Override
    public void update(String currency, double rate) {
        System.out.println("Трейдер " + name +
                " получил обновление: " +
                currency + " = " + rate);
    }
}