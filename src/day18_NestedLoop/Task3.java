package day18_NestedLoop;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number:");
            int num1 = input.nextInt();
            System.out.println("Enter a maths operator:");
            char operator = input.next().charAt(0);

            while (!(operator == '*' || operator == '/' || operator == '+' || operator == '-')) {
                System.out.println("Please enter a valid math operator");
                operator = input.next().charAt(0);
            }
            System.out.println("Enter a second number:");
            int num2 = input.nextInt();

            int sum = 0;
            if (operator == '*') {
                sum += num1 * num2;
            } else if (operator == '/') {
                sum += num1 / num2;
            } else if (operator == '+') {
                sum += num1 + num2;
            } else {
                sum += num1 - num2;
            }
            System.out.println("Total: " + sum);
            System.out.println("Do you want to continue");
            String a1 = input.next().toLowerCase();
            if (a1.equalsIgnoreCase("no")) {
                System.out.println("Thanks");
                break;
            }
            while (!(a1.equalsIgnoreCase("yes") || a1.equalsIgnoreCase("no"))) {
                System.out.println("Please enter a valid answer");
                a1 = input.next();
            }

        }
    }
}

