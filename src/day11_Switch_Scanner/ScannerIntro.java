package day11_Switch_Scanner;

import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num1 = input.nextInt();
        System.out.println(num1);

        //assign double variable num2
        System.out.println("Enter a decimal:");
        double num2 = input.nextDouble();

        System.out.println(num1);
        System.out.println(num2);
        System.out.println("Multiplication: " + (num1 * num2));
        //when finished using scanner close it
        input.close(); //scanner gets terminated , it slows the INTELIJJ

    }


}
