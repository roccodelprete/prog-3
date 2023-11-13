import abstractFactoryPackage.*;

public class Main {
    public static void main(String[] args) {
        ConcreteFactory1 factory1 = new ConcreteFactory1();
        ConcreteFactory2 factory2 = new ConcreteFactory2();

        ProductA1 productA1 = (ProductA1) factory1.createProductA();
        ProductA2 productA2 = (ProductA2) factory2.createProductA();

        ProductB1 productB1 = (ProductB1) factory1.createProductB();
        ProductB2 productB2 = (ProductB2) factory2.createProductB();

        productA1.setProductName("Audi");
        productA2.setProductName("Mercedes");

        productB1.setProductName("BMW");
        productB2.setProductName("Skoda");

        System.out.println(productA1.getProductName());
    }
}