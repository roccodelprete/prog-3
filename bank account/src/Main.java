import bank.Bank;
import bank.Coin;
import bank.Dataset;
import bank.Purse;

public class Main {
    public static void main(String[] args) {
        Purse purse = new Purse();
        Bank account = new Bank("IT", 0);
        Bank account1 = new Bank("IT", 0);

        Coin dollar = new Coin("Dollar", 1.01);
        Coin euro = new Coin("Euro", 1.10);
        Coin[] yen = new Coin[2];
        for (int i = 0; i < 2; i++) {
            yen[i] = new Coin("Yen", 10);
            purse.add(yen[i]);
        }

        Dataset bankDataset = new Dataset();

        System.out.println("\nCoin: " + dollar.getName() + "\tValue: " + dollar.getMeasure());
        System.out.println("Coin: " + euro.getName() + "\t\tValue: " + euro.getMeasure());
        System.out.println("\n");


        System.out.println("Account number: " + account.getAccountNumber());
        System.out.println("Account number: " + account1.getAccountNumber());
        System.out.println("\n");

        System.out.println("Account: " + account.getAccountNumber() + "\tBalance: " + account.getMeasure());
        System.out.println("Account: " + account1.getAccountNumber() + "\tBalance: " + account.getMeasure());
        System.out.println("\n");

        account.deposit(100);
        account1.deposit(1000);

        System.out.println("Account: " + account.getAccountNumber() + "\tBalance: " + account.getMeasure());
        System.out.println("Account: " + account1.getAccountNumber() + "\tBalance: " + account1.getMeasure());
        System.out.println("\n");

        String response = account.equals(account1) ? "Yes" : "No";
        System.out.println("Are the bank accounts equals? " + response);
        System.out.println("\n");

        bankDataset.add(account);
        System.out.println("Bank dataset: " + bankDataset.getSum());

        purse.add(dollar);
        purse.add(euro);
        System.out.println("Purse total: " + purse.getTotal());
        System.out.println("Purse maximum: " + purse.getMaximum().getName() + "\t" + purse.getMaximum().getMeasure());
        System.out.println("Purse matches: " + purse.matches(yen[0]));
    }
}