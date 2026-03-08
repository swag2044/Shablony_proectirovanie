public class ChatDemo {

    public static void main(String[] args) {

        ChatRoom chat = new ChatRoom();

        User user1 = new User("Alice", chat);
        User user2 = new User("Bob", chat);
        User user3 = new User("John", chat);

        chat.addUser(user1);
        chat.addUser(user2);
        chat.addUser(user3);

        user1.send("Привет всем!");
        user2.send("Привет!");
    }
}