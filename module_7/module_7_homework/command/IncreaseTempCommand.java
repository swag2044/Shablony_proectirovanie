public class IncreaseTempCommand implements ICommand {

    private Thermostat thermostat;

    public IncreaseTempCommand(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    public void execute() {
        thermostat.increaseTemp();
    }

    public void undo() {
        thermostat.decreaseTemp();
    }
}