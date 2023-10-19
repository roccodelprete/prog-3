package bank;

public class Dataset {
    private double sum = 0;
    private double count = 0;

    public double getSum() {
        return this.sum;
    }

    public void add(BankInterface bankInterface) {
        sum += bankInterface.getMeasure();
    }
}
