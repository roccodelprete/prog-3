package bank;

import java.util.ArrayList;

public class Purse {
    private ArrayList coins;
    private double total;

    public Purse() {
        coins = new ArrayList();
    }

    public void add(Coin coin) {
        coins.add(coin);
    }

    public double getTotal() {
        coins.forEach((coin) -> {
            total += ((Coin)coin).getMeasure();
        });

        return total;
    }
}
