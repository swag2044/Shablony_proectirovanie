public class SmartHomeDemo {

    public static void main(String[] args) {

        Light light = new Light();
        TV tv = new TV();

        ICommand lightOn = new LightOnCommand(light);
        ICommand lightOff = new LightOffCommand(light);
        ICommand tvOn = new TVOnCommand(tv);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(0, lightOn);
        remote.setCommand(1, lightOff);
        remote.setCommand(2, tvOn);

        remote.pressButton(0);
        remote.pressButton(2);

        remote.undo();
        remote.redo();
    }
}