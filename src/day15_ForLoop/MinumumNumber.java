package day15_ForLoop;

import java.util.Scanner;

public class MinumumNumber {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int min = 2147483647;

        for (int i = 10; i < 15; i++) {

            System.out.println("Enter a number:");
            int num = input.nextInt();
            if (num < min) {
                min = num;
            }
        }
        System.out.println("min: " + min);


        input.close();

    }


}
