package bank;

public class Check extends Bank {
    private static final int FREE_TRANSACTIONS = 3;
    private static final double FEE = 2.0;
    private int transactionCounter;

    public Check(String accountNumber, double balance) {
        super(accountNumber, balance);
        transactionCounter = 0;
    }

    @Override
    public void withdraw(double amount) {
        transactionCounter++;
        super.withdraw(amount);
    }

    @Override
    public void deposit(double amount) {
        transactionCounter++;
        super.deposit(amount);
    }

    public void deductFees() {
        if (transactionCounter > FREE_TRANSACTIONS) {
            double fees = FEE * (transactionCounter - FREE_TRANSACTIONS);
            super.withdraw(fees);
        }
        transactionCounter = 0;
    }
}
