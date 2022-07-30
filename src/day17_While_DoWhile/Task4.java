package day17_While_DoWhile;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String divBy15 = "";
        String divBy3 = "";
        String divBy5 = "";

        System.out.println("Enter a number");
        int num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                divBy15 += i + " ";
            } else if (i % 3 == 0 && i % 15 != 0) {
                divBy3 += i + " ";
            } else if (i % 5 == 0 && i % 15 != 0) {
                divBy5 += i + " ";
            }
        }
            System.out.println("divBy15 = " + divBy15 );
            System.out.println("divBy5 = " + divBy5 + " ");
            System.out.println("divBy3 = " + divBy3 + " ");

        input.close();
    }


}
