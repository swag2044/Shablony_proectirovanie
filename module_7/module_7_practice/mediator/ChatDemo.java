public class ChatDemo {

    public static void main(String[] args) {

        ChatMediator mediator = new ChatMediator();

        IUser user1 = new User("Alice", mediator);
        IUser user2 = new User("Bob", mediator);
        IUser user3 = new User("John", mediator);

        mediator.addUser(user1, "general");
        mediator.addUser(user2, "general");
        mediator.addUser(user3, "games");

        user1.send("Привет!", "general");
        user2.send("Как дела?", "general");

        user3.send("Кто играет?", "games");
    }
}