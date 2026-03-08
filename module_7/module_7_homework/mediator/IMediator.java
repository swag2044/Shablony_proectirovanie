public interface IMediator {

    void sendMessage(String message, User sender);

    void addUser(User user);

    void removeUser(User user);
}