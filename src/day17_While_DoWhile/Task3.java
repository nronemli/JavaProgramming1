package day17_While_DoWhile;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n1 = input.nextInt();
        System.out.println("Enter a number:");
        int n2 = input.nextInt();
        System.out.println("Enter a math operator:");
        char ch = input.next().charAt(0);

        int sum = 0;
        while (!(ch == '+' || ch == '-' || ch == '*' || ch == '/')) {
            System.out.println("Re enter maths operator");
            ch = input.next().charAt(0);
        }
        if (ch == '+') {
            sum += n1 + n2;
            System.out.println("Sum: " + sum);
        } else if (ch == '-') {
            sum += n1 - n2;
            System.out.println("Sum: " + sum);
        } else if (ch == '*') {
            sum += n1 * n2;
            System.out.println("Sum: " + sum);
        } else {
            sum += n1 / n2;
            System.out.println("Sum: " + sum);
        }
        input.close();
    }
}








