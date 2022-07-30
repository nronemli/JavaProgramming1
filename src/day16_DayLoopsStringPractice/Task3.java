package day16_DayLoopsStringPractice;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two numbers");
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        int result = 0;

        if (n1 < 0 && n2 < 0) {
            System.out.println("Invalid");
        } else {
            for (int i = 0; i < n2; i++) {

                result += n1;
            }
            System.out.println(result);

        }


    }

}















