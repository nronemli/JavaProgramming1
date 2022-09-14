package day45_Abstraction;

public abstract class Shape {

    private final String name;

    //can be done in another way check other classes
    public Shape(String name) {
        this.name = getClass().getSimpleName();
    }

    public String getName() {
        return name;
    }

    public abstract double area();

    public abstract double perimeter();

    @Override
    public String toString() {
        return getClass().getSimpleName() +"{"+
                "name='" + name + '\'' +
                "area=' "+ area() +'\'' +
                "perimeter=' "+ perimeter() +'\'' +
                '}';
    }
}
