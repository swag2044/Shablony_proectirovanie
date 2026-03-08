import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements IMediator {

    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
        System.out.println(user.getName() + " присоединился к чату");
    }

    public void removeUser(User user) {
        users.remove(user);
        System.out.println(user.getName() + " покинул чат");
    }

    public void sendMessage(String message, User sender) {

        for (User user : users) {

            if (user != sender) {
                user.receive(message);
            }
        }
    }
}