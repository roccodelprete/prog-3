package abstractFactoryPackage;

public class ProductB1 extends AbstractProductB {
    private String productName;

    @Override
    public String getProductName() {
        return productName;
    }

    @Override
    public void setProductName(String productName) {
        this.productName = productName;
    }
}
