package editor;

public class Rectangle implements Calculations<Double> {
    private double width, height;

    public void setWidth(double newWidth) {
        this.width = newWidth;
    }

    public void setHeight(double newHeight) {
        this.height = newHeight;
    }

    public double getWidth() {
        return this.width;
    };

    public double getHeight() {
        return this.height;
    };

    @Override
    public Double area() {
        return this.width * this.height;
    }
}
