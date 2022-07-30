package day17_While_DoWhile;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number:");
        int num1 = input.nextInt();

        System.out.println("Enter your second number:");
        int num2 = input.nextInt();

        System.out.println("Enter math operator");
        char ch = input.next().charAt(0);

        while (!(ch == '+' || ch == '-')) {
            //if operator is invalid will be repeated over
            // and over  when its true it will be printed
            System.out.println("Invalid, please enter math op");
            ch = input.next().charAt(0);
        }


        input.close();

    }


}
