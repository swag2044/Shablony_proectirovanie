public class SmartHomeDemo {

    public static void main(String[] args) {

        Light light = new Light();
        Door door = new Door();
        Thermostat thermostat = new Thermostat();

        ICommand lightOn = new LightOnCommand(light);
        ICommand doorOpen = new DoorOpenCommand(door);
        ICommand tempUp = new IncreaseTempCommand(thermostat);

        Invoker remote = new Invoker();

        remote.executeCommand(lightOn);
        remote.executeCommand(doorOpen);
        remote.executeCommand(tempUp);

        remote.undo();
        remote.undo();
    }
}