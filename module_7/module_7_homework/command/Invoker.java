import java.util.Stack;

public class Invoker {

    private Stack<ICommand> history = new Stack<>();

    public void executeCommand(ICommand command) {
        command.execute();
        history.push(command);
    }

    public void undo() {

        if (history.isEmpty()) {
            System.out.println("Нет команды для отмены");
            return;
        }

        ICommand command = history.pop();
        command.undo();
    }
}