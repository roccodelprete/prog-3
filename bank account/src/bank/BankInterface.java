package bank;

public interface BankInterface {
    double getMeasure();

    /**
     * Method to check if two bank accounts are equals
     * @param otherObject the other bank account to check
     * @return true if are equals, false if not.
     */
    boolean equals(Object otherObject);
}
