import orderManagementPackage.Agent;
import orderManagementPackage.BuyStock;
import orderManagementPackage.SellStock;
import orderManagementPackage.Stock;

/**
 * This is the client which have main
 */
public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock();
        BuyStock buyStock = new BuyStock(stock);
        SellStock sellStock = new SellStock(stock);
        Agent agent = new Agent();

        agent.placeOrder(buyStock);
        agent.placeOrder(sellStock);

        agent.executeOrder();
    }
}