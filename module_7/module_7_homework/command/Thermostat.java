public class Thermostat {

    private int temperature = 20;

    public void increaseTemp() {
        temperature++;
        System.out.println("Температура увеличена до " + temperature);
    }

    public void decreaseTemp() {
        temperature--;
        System.out.println("Температура уменьшена до " + temperature);
    }
}