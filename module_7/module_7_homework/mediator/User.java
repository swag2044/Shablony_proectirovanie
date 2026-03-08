public class User {

    private String name;
    private IMediator mediator;

    public User(String name, IMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void send(String message) {
        mediator.sendMessage(name + ": " + message, this);
    }

    public void receive(String message) {
        System.out.println(name + " получил сообщение: " + message);
    }
}