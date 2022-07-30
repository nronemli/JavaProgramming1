package day20_Arrays;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter:");
        int many = input.nextInt();


        int[] num = new int[many];
        for (int i = 0; i < num.length; i++) {
            System.out.println("Enter 3 numbers");
            num[i] = input.nextInt(); //each user input will be asssigned to the indexes of the array numbers
        }

        int max = num[0];
        int min = num[0];

        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
            if (num[i] < max) {
                min = num[i];
            }

        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);

        input.close();
    }
}

