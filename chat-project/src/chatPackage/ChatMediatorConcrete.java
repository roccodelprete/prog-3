package chatPackage;

import java.util.ArrayList;

public class ChatMediatorConcrete implements ChatMediator {
    private ArrayList<User> users;
    private String chatName;

    public ChatMediatorConcrete(String chatName) {
        this.users = new ArrayList<User>();
        this.chatName = chatName;
    }

    @Override
    public String getChatName() {
        return chatName;
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        this.users.forEach((u) -> {
            if (u != user) {
                u.receive(message);
            }
        });
    }
}
