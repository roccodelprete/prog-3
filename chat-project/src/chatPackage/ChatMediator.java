package chatPackage;

public interface ChatMediator {
    String getChatName();
    void sendMessage(String msg, User user);

    void addUser(User user);
}
