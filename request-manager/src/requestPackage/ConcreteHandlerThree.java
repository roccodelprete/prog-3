package requestPackage;

public class ConcreteHandlerThree extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getValue() == 0) {
            System.out.println("Zero values are handled by\n" +
                    "ConcreteHandlerThree:");

            System.out.println("\t ConcreteHandlerThree.HandleRequest : " + request.getDescription() + request.getValue());
        } else {
            successor.handleRequest(request);
        }
    }
}
