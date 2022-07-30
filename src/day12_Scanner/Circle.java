package day12_Scanner;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        double radius = input.nextDouble();

        double area = radius * radius * 3.14;
        double perimeter = 2 * radius * 3.14;

        System.out.println("Area = " + area);
        System.out.println("Perimeter= " + perimeter);

        input.close(); //close scanner

    }


}
