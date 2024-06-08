package factoryPackage;

public abstract class Factory {
    public abstract Product factoryMethod();

    public void doSomething() {
        Product product = factoryMethod();

        System.out.println("New Product");
    }
}
