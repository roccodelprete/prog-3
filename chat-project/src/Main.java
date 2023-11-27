import chatPackage.ChatMediator;
import chatPackage.ChatMediatorConcrete;
import chatPackage.UserConcrete;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ChatMediatorConcrete mediator = new ChatMediatorConcrete("Gruppo studi");

        ArrayList<UserConcrete> users = new ArrayList<>();

        users.add(new UserConcrete(mediator, "Rocco"));
        users.add(new UserConcrete(mediator, "Antonio"));
        users.add(new UserConcrete(mediator, "Luca"));

        users.forEach(mediator::addUser);

        System.out.println("Chat name: " + mediator.getChatName());
        users.get(0).send("Hello");
    }
}