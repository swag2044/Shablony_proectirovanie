public class DecreaseTempCommand implements ICommand {

    private Thermostat thermostat;

    public DecreaseTempCommand(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    public void execute() {
        thermostat.decreaseTemp();
    }

    public void undo() {
        thermostat.increaseTemp();
    }
}