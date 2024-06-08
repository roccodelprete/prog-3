import builderPackage.Builder;
import builderPackage.ConcreteBuilder;
import builderPackage.Director;
import builderPackage.Product;

public class Main {
    public static void main(String[] args) {
        ConcreteBuilder builder = new ConcreteBuilder();
        Director director = new Director();
        director.construct(builder);

        Product product = builder.getResult();
        product.setProductName("builder test");

        System.out.println(product.getProductName());
    }
}