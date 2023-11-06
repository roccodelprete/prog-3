import editor.Circle;
import editor.Graphic;
import editor.Rectangle;

public class Main {
    public static void main(String[] args) {
        Graphic rectangle = new Graphic();
        Graphic circle = new Graphic();
        circle.drawShape(new Circle());

        Rectangle rect = new Rectangle();
        rect.setHeight(10);
        rect.setWidth(20);
        System.out.println("Area = " + rect.area());
    }
}