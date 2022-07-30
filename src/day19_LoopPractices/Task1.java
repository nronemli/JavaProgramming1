package day19_LoopPractices;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the radius of circle:");
            int radius = input.nextInt();

            if (radius == 0 || radius < 0) {
                System.err.println("Invalid Entry for the radius of the circle");
                System.exit(0);
            }

            System.out.println("Diameter of circle: " + (radius * 2));
            System.out.println("Area of circle: " + (3.14 * radius * radius));
            System.out.println("Perimeter of circle: " + (3.14 * 2 * radius));
            System.out.println();
            System.out.println("Would you like to calculate another circle?");
            String answer = input.next();


         /*   while (answer.equalsIgnoreCase("yes")) {
                System.out.println("Enter the radius of circle:");
                radius = input.nextInt();
                System.out.println("Diameter of circle: " + (radius * 2));
                System.out.println("Area of circle: " + (3.14 * radius * radius));
                System.out.println("Perimeter of circle: " + (3.14 * 2 * radius));

                System.out.println("Would you like to calculate another circle?");
                answer = input.next();

            }*/
            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using Cydeo Circle Calculator APP");
                System.exit(0);
            }

            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                System.err.println("Invalid entry please re-enter: ");
                answer = input.next();
                break;
            }

        }
    }

}

