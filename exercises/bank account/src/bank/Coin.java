package bank;

public class Coin implements BankInterface {
    private String name;
    private double value;
    private double sum = 0;

    public Coin(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public double getMeasure() {
        return this.value;
    }

    public void setValue(double newValue) {
        this.value = newValue;
    }

    public boolean equals(Object otherObject) {
        Coin coin = (Coin) otherObject;
        return this.name == ((Coin)coin).getName() && this.value == coin.getMeasure();
    }
}
