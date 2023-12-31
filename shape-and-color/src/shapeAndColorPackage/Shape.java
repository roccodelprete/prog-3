package shapeAndColorPackage;

public abstract  class Shape implements Color {
    protected Color color;

    public Shape (Color color) {
        this.color = color;
    }

    public abstract void applyColor();
}
