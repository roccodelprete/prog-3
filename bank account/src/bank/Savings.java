package bank;

public class Savings extends Bank {
    private double interestRate;

    public Savings() {}

    public Savings(double interestRate) {
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = getMeasure() * interestRate / 100;
        deposit(interest);
    }
}
