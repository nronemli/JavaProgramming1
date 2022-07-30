package day12_Scanner;

import java.util.Scanner;

public class MilesToKM {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter miles: ");
        double miles = input.nextDouble();
        double result = miles * 1.609;

        System.out.println(miles);

        System.out.println(miles + " miles equal to " + result + " kilometers");
        input.close();

    }


}
