import abstractFactoryPackage.*;

public class Main {
    public static void main(String[] args) {
        ConcreteFactory1 factory1 = new ConcreteFactory1();
        ConcreteFactory2 factory2 = new ConcreteFactory2();

        AbstractProductA productA1 = factory1.createProductA();
        AbstractProductA productA2 = (ProductA2) factory2.createProductA();

        AbstractProductB productB1 = factory1.createProductB();
        AbstractProductB productB2 = factory2.createProductB();

        productA1.setProductName("Audi");
        productA2.setProductName("Mercedes");

        productB1.setProductName("BMW");
        productB2.setProductName("Skoda");

        System.out.println(productA1.getProductName());
    }
}