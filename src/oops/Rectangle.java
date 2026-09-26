package oops;

public class Rectangle extends Shapes {

    double length;
    double breadth;

    public Rectangle (String color, double length, double breadth) {
        super(color);
        this.length = length;
        this.breadth = breadth;

    }

    @Override
    public double area() {
        return length * breadth;
    }
    @Override
    public String toString() {
        return "Color of Rectangle is: " + getColor() + "\n" + "Area of Rectangle is: " + area();
    }
}
