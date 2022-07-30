package day19_LoopPractices;

import java.util.Scanner;

public class TASK2 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the side of the square:");
            int square = input.nextInt();

            if (square == 0 || square < 0) {
                System.err.println("Invalid Entry for the side of the square");
                System.exit(0);
            }

            System.out.println("Area of square: " + (square * square));
            System.out.println("Perimeter of square: " + (square * 4));

            System.out.println("Would you like to calculate another Square?");
            String answer = input.next();

            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using Cydeo Square Calculator APP");
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

