package day14_Strings;

import java.util.Scanner;

public class D14Task6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an account number:");
        String accNo = input.next();

        String firstChar = String.valueOf(accNo.charAt(0));

        if (firstChar == "2" && accNo.length() == 7) {
            System.out.println("Account number valid");

        } else if (firstChar == "5" && accNo.length() == 10) {
            System.out.println("Account number valid");

        } else {
            System.out.println("Invalid account number");
        }
        input.close();

    }
}
