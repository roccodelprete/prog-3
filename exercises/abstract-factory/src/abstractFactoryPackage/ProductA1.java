package abstractFactoryPackage;

public class ProductA1 extends AbstractProductA {
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
