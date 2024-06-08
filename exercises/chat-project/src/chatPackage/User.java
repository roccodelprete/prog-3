package chatPackage;

public abstract class User {
    protected String name;
    protected ChatMediator mediator;

    public User(ChatMediator mediator, String name) {
        this.name = name;
        this.mediator = mediator;
    }

    public abstract void send(String message);
    public abstract void receive(String message);
}
