package day15_ForLoop;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i < 101; i++) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println("------------------------------------");

        int total = 0;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            total += input.nextInt();
        }
        System.out.println("total: " + total);

input.close();
    }
}
