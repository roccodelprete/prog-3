package builderPackage;

public class ConcreteBuilder extends Builder {
    @Override
    public void buildPart() {
        System.out.println("Building part...");
    }

    public Product getResult() {
        return new Product();
    }
}
