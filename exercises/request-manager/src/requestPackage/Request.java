package requestPackage;

public class Request {
    private int value;
    public String description;

    public Request(String description, int value) {
        this.description = description;
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public String getDescription() {
        return this.description;
    }
}
