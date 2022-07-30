package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoopPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your age");
            int age = input.nextInt();

            while (!(age >= 1 && age <= 120)) {
                System.err.println("Invalid entry, please re-enter age:");
                age = input.nextInt();
            }
            System.out.println("Would you like to continue:");
            String a = input.next().toLowerCase();

            while (!(a.equalsIgnoreCase("Yes") || a.equalsIgnoreCase("No"))) {
                System.err.println("Invalid entry, please re-enter age:");
                age = input.nextInt();
            }

            if (a.equalsIgnoreCase("no")) {
                break;
            }
            input.close();
        }
    }
}







