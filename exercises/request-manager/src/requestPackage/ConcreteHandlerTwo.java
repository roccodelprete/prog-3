package requestPackage;

public class ConcreteHandlerTwo extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getValue() > 0) {
            System.out.println("Positive values are handled by\n" +
                    "ConcreteHandlerTwo:");

            System.out.println("\t ConcreteHandlerTwo.HandleRequest : " + request.getDescription() + request.getValue());
        } else {
            successor.handleRequest(request);
        }
    }
}
