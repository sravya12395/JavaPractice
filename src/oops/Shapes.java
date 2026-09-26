package oops;

abstract class Shapes {

    private String color;

    public Shapes (String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    abstract double area();
    public abstract String toString();
}
