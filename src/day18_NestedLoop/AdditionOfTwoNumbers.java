package day18_NestedLoop;

import java.util.Scanner;

public class AdditionOfTwoNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your first number:");
            int num1 = input.nextInt();

            System.out.println("Enter your second number:");
            int num2 = input.nextInt();

            System.out.println("Sum: " + (num1 + num2));
            System.out.println("Would you like to continue");
            String answer = input.next();

            while(!(answer.equalsIgnoreCase("Yes")||(answer.equalsIgnoreCase("No")))){
                    System.err.println("Invalid entry, please re enter: ");
                answer = input.next();
            }
            if (answer.equalsIgnoreCase("No")) {
                break;
            }
        }
    }
}
