package day12_Scanner;

import java.util.Scanner;

public class CurrencyConvertor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter cents: ");
        int cents = input.nextInt();
        int dollar = cents / 100;

        cents = cents - (dollar * 100);
        System.out.println(dollar + " dollars and " + cents + " cents.");

        input.close();
    }


}
