package day19_LoopPractices;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num1 = input.nextInt();

        System.out.println("Enter a math operator");
        char op = input.next().charAt(0);

        if(!(op== '+' || op=='-')){ //if operator is not valid
            System.err.println("Invalid math operator: " + op); //displays error message in red
        System.exit(0); //terminates the whole program
        }
        System.out.println("Enter a number:");
        int num2 = input.nextInt();


    }
}
