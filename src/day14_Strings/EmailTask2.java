package day14_Strings;

import java.util.Scanner;

public class EmailTask2 {
    public static void main(String[] args) {

        System.out.println("Enter an email address:");
        Scanner input = new Scanner(System.in);
        String email = input.next();

        String fName = email.substring(0, (email.indexOf("_")));

        String lName = email.substring(email.indexOf("_") + 1, email.indexOf("@"));

        String end = email.substring(email.indexOf("@"));

        System.out.println("First name: " + fName.substring(0, 1).toUpperCase() + fName.substring(1));
        System.out.println("Last name: " + lName.substring(0, 1).toUpperCase() + lName.substring(1));
        System.out.println("Domain: " + end.substring(1, end.indexOf(".")));
        input.close();

    }



}
