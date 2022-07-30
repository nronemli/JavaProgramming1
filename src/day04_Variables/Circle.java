package day04_Variables;

public class Circle {

    public static void main(String[] args) {

        /* Data types: PI , radius, diameter, area, perimeter
        PI : 3.14
        Area: radius * radius * PI
        Perimeter = 2 * radius * PI */

        double PI = 3.14;
        double radius = 10;
        double diameter = radius *2 ; //finds the diameter by multiplying x2
        double area = radius * radius * PI; //finds the area of circle
        double perimeter = diameter * PI;  //finds the perimeter of circle

        System.out.println("Circle Calculator");
        System.out.println("Diameter = " +diameter);
        System.out.println("Radius   = " + radius);
        System.out.println("Area     = " +area);
        System.out.println("Perimeter= " + perimeter);



    }



}
