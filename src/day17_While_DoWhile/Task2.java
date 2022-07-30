package day17_While_DoWhile;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = 0;
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            System.out.println("Please enter a number:");
            num = input.nextInt();
            sum += num;
            System.out.println("sum: " + sum);
            while (!(num < 0)) { //if number is negative break
                break;
            }
        }
        input.close();

    }



}
