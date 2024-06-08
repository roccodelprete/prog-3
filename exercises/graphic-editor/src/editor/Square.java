package editor;

public class Square<T extends Number> implements Calculations<Double> {
    private T side;

    public void setSide(T newSide) {
        this.side = newSide;
    }

    public T getSide() {
        return this.side;
    };

    public Double area() {
        return Math.pow(this.side.doubleValue(), 2);
    }
}
