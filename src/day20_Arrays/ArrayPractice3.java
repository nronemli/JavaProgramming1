package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many number would you like to enter");
        int length = input.nextInt();

        if (length <= 0) { //if they enter less or equal to 0
            System.err.println("Invalid entry");
            System.exit(0);
        }

        int[] num = new int[length];
        for (int i = 0; i < length; i++) { //0-9 SINCE Index starts from 0 //LENGTH LESS THAN
            System.out.println("Enter a number");
            num[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(num)); //print the whole array


        input.close();

    }
}
