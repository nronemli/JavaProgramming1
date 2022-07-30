package day15_ForLoop;

import java.util.Scanner;

public class ForLoopTasks {

    public static void main(String[] args) {

        //task1

        for (int i = 2; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println("Sum of even numbers: " + i);
            }
        }
        System.out.println("----------------------------------");
        //task2

        for (int i = 1; i < 100; i++) {
            if (i % 2 == 1) {
                System.out.println("Sum of odd numbers: " + i);
            }
        }
        System.out.println("----------------------------------");

        //task 3
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();

        int total = 0;
        for (int i = 1; i < number; i++) {
            total += i;
        }
        System.out.println("total: " + total);

        System.out.println("----------------------------------");

        //TASK4

        System.out.println("Enter a number: ");
        int num1 = input.nextInt();
        int sum = 0;
        for (int i = 0; i < num1; i++) {
            sum += num1 * (num1 - 1);
        }
        System.out.println("Total: " + sum);


        //TASK5

        String chars = "mn@#123Ab!";
        String digits = "";
        String letters = "";
        String specialChars = "";

        for (int i = 0; i < chars.length(); i++) {
            char c = chars.charAt(i);
            if (c >=0 & c <=9) {
                digits += c;
            } else if (c >= 'a' & c <= 'z') {
                letters += c;
            } else if (c>='A' & c<='Z') {
                letters += c;
            } else {
                specialChars += c;
            }
        }

        System.out.println("specialChars = " + specialChars);
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);

        input.close();


    }


}
