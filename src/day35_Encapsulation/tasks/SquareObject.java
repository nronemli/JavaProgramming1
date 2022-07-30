package day35_Encapsulation.tasks;

public class SquareObject {

    public static void main(String[] args) {

        Square s1 = new Square(2);
        System.out.println("Number of side: " + s1.getSide());
        System.out.println("Perimeter of square " + s1.calcPerimeter());
        System.out.println("Area of square " + s1.calcArea());
        System.out.println(s1);

    }
}
