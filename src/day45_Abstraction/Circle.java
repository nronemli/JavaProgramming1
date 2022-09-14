package day45_Abstraction;

public class Circle extends Shape {

    private double radius;
    public final static double pi = 3.14;

    public Circle(double radius) {
        super("Circle"); //calling parent class constructor
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    //more control over the data
    public void setRadius(double radius) {
        if (radius < 0) {
            throw new RuntimeException("Negative radius is invali " + radius);
        }
        this.radius = radius;
    }


    @Override
    public double area() {
        return radius * radius * pi;
    }

    @Override
    public double perimeter() {
        return 2 * radius * pi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                super.toString() +
                "radius=" + radius +
                '}';
    }
}
