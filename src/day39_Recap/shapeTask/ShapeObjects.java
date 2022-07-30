package day39_Recap.shapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

        System.out.println("+++++++++++++++++++++++++");
        Square s1 = new Square(10);
        System.out.println(s1.getName());
        System.out.println(s1);
        System.out.println(s1.area());
        System.out.println(s1.perimeter());
        System.out.println("+++++++++++++++++++++++++");

        Rectangle r1 = new Rectangle(5, 5);
        System.out.println(r1.getName());
        System.out.println(r1);
        System.out.println(r1.area());
        System.out.println(r1.perimeter());

        r1.setLength(10);
        System.out.println(r1.getLength()); //10
        System.out.println(r1);

        System.out.println("+++++++++++++++++++++++++");
        Circle c1 = new Circle(7.5);
        System.out.println(c1);
        System.out.println(c1.area());
        System.out.println(c1.perimeter());
        System.out.println(c1.getName());
        System.out.println(c1.getRadius());

        System.out.println("+++++++++++++++++++++++++");

    }
}
