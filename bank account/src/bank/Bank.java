package bank;

public class Bank implements BankInterface {
  private double balance;
  private String accountNumber;
  private double sum;

  public Bank() {}

  public Bank(String accountNumber, double balance) {
    double lastAssignedNumber = Math.random() * 1e10;
    this.accountNumber = accountNumber + (int)lastAssignedNumber++;
    this.balance = balance;
  }

  public double getMeasure() {
    return this.balance;
  }

  public String getAccountNumber() {
    return this.accountNumber;
  }

  public void deposit(double amount) {
    balance += amount;
  }

  public void withdraw(double amount) {
    balance -= amount;
  }

  /**
   * Method to check if two bank accounts are equals
   * @param otherObject the other bank account to check
   * @return true if are equals, false if not.
   */
  public boolean equals(Object otherObject) {
    Bank bank = (Bank) otherObject;

    return this.balance == bank.getMeasure();
  }
}
