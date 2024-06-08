import factoryPackage.ConcreteFactory;
import factoryPackage.ConcreteProduct;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ConcreteFactory factory = new ConcreteFactory();
        ConcreteProduct product = (ConcreteProduct) factory.factoryMethod();
        factory.doSomething();

        product.setName("uova");
        System.out.println("Product name = " + "\t" + product.getName());
    }
}