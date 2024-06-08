package requestPackage;

public class ConcreteHandlerOne extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getValue() < 0) {
            System.out.println("Negative values are handled by\n" +
                    "ConcreteHandlerOne:");

            System.out.println("\t ConcreteHandlerOne.HandleRequest : " + request.getDescription() + request.getValue());
        } else {
            successor.handleRequest(request);
        }
    }
}
