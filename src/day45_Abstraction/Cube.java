package day45_Abstraction;

public class Cube extends Shape implements Volume{

    public Cube(String name) {
        super(name);
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public double Volume() {
        return 0;
    }
}
