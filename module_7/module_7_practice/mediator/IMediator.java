public interface IMediator {

    void sendMessage(String message, IUser user, String channel);

    void addUser(IUser user, String channel);

    void removeUser(IUser user, String channel);
}