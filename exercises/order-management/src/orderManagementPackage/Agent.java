package orderManagementPackage;

import java.util.LinkedList;
import java.util.Queue;

public class Agent {
    Queue<Order> q = new LinkedList<>();

    public void placeOrder(Order order) {
        q.add(order);
    }

    public void executeOrder() {
        while (!q.isEmpty()) {
            Order extractedOrder = q.remove();
            extractedOrder.execute();
        }
    }
}
