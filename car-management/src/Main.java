import carManagementPackage.*;

public class Main {
    public static void main(String[] args) {
        Car sportLuxuryCar = new SportCar(new LuxuryCar(new BasicCar()));
        sportLuxuryCar.assemble();
    }
}