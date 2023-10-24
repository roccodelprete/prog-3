package bank;

import java.util.ArrayList;

public class Purse {
    private ArrayList<Coin> coins;
    private double total;

    public Purse() {
        coins = new ArrayList<>();
    }

    /**
     * function to add a coin in the purse
     * @param coin - the coin to add
     */
    public void add(Coin coin) {
        coins.add(coin);
    }

    /**
     * function to get the totale value of the purse
     * @return the total
     */
    public double getTotal() {
        coins.forEach((coin) -> total += coin.getMeasure());

        return total;
    }

    /**
     * function to get how many coins are in the purse
     * @return the purse size
     */
    public int count() {
        return coins.size();
    }

    /**
     * function to find a coin in the purse
     * @param coinToFind - the coin to find
     * @return true if the coin has found
     * or false otherwise
     */
    public boolean find(Coin coinToFind) {
        boolean found = false;

        for (Coin coin : coins) {
            found = coin.equals(coinToFind);
        }
        return found;
    }

    /**
     * function to get how many times a coin is in the purse
     * @param coinToMatch - coin to match
     * @return the matches
     */
    public int matches(Coin coinToMatch) {
        int matches = 0;

        for (Coin coin : coins) {
            if (coin.equals(coinToMatch)) {
                matches++;
            }
        }

        return matches;
    }

    /**
     * function to get max value in the purse
     * @return the max value
     */
    public Coin getMaximum() {
        Coin max = coins.get(0);

        for (Coin coin : coins) {
            if (coin.getMeasure() > max.getMeasure()) {
                max = coin;
            }
        }

        return max;
    }
}
