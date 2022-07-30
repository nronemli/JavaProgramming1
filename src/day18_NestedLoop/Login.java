package day18_NestedLoop;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a username");
        String name = input.next();

        System.out.println("Enter a password:");
        String pass = input.next();

        if (name.equalsIgnoreCase("Cydeo") && pass.equalsIgnoreCase("Cydeo123")) {
            System.out.println("Logged in");
        } else {
            for (int i = 0; i < 3; i++) {
                System.out.println("Incorrect username or password");
                System.out.println("Enter a username");
                name = input.next();

                System.out.println("Enter a password:");
                pass = input.next();

                if (name.equalsIgnoreCase("Cydeo") && pass.equalsIgnoreCase("Cydeo123")) {
                    System.out.println("Logged in");
                    break;
                }
            }
            if (!(name.equalsIgnoreCase("Cydeo") && pass.equalsIgnoreCase("Cydeo123"))) {
                System.err.println("Account locked, please contact the support team");
            }
        }

input.close();
    }
}
