import java.util.Stack;

public class RemoteControl {

    private ICommand[] buttons = new ICommand[5];
    private Stack<ICommand> history = new Stack<>();
    private Stack<ICommand> redoStack = new Stack<>();

    public void setCommand(int slot, ICommand command) {
        buttons[slot] = command;
    }

    public void pressButton(int slot) {

        if (buttons[slot] == null) {
            System.out.println("Команда не назначена");
            return;
        }

        buttons[slot].execute();
        history.push(buttons[slot]);
        redoStack.clear();
    }

    public void undo() {

        if (!history.isEmpty()) {
            ICommand command = history.pop();
            command.undo();
            redoStack.push(command);
        }
    }

    public void redo() {

        if (!redoStack.isEmpty()) {
            ICommand command = redoStack.pop();
            command.execute();
            history.push(command);
        }
    }
}