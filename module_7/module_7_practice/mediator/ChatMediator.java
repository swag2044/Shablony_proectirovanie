import java.util.*;

public class ChatMediator implements IMediator {

    private Map<String, List<IUser>> channels = new HashMap<>();

    public void addUser(IUser user, String channel) {

        channels.putIfAbsent(channel, new ArrayList<>());
        channels.get(channel).add(user);

        sendMessage(user.getName() + " вошел в канал", user, channel);
    }

    public void removeUser(IUser user, String channel) {

        if (channels.containsKey(channel)) {
            channels.get(channel).remove(user);
        }
    }

    public void sendMessage(String message, IUser sender, String channel) {

        if (!channels.containsKey(channel)) {
            System.out.println("Канал не существует");
            return;
        }

        for (IUser user : channels.get(channel)) {

            if (user != sender) {
                user.receive(sender.getName() + ": " + message);
            }
        }
    }
}