import shapeAndColorPackage.Shape;
import shapeAndColorPackage.Triangle;
import shapeAndColorPackage.Pentagon;
import shapeAndColorPackage.Red;
import shapeAndColorPackage.Green;


public class Main {
    public static void main(String[] args) {
        Shape triangle = new Triangle(new Red());
        triangle.applyColor();

        Shape pentagon = new Pentagon(new Green());
        pentagon.applyColor();
    }
}