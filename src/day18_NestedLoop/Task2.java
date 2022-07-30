package day18_NestedLoop;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("What size room would you like to reserve?");
            System.out.println("King / Queen/ Single: ");
            String room = input.next();

            System.out.println("How many nights would you like to stay?");
            int nights = input.nextInt();
            int sum = 0;

            System.out.println("Would you like to reserve another room?");
            String r1 = input.next().toLowerCase();

            if (room.equalsIgnoreCase("King")) {
                sum += 120 * nights;
            } else if (room.equalsIgnoreCase("Queen")) {
                sum += 100 * nights;
            } else {
                sum += 80 * nights;
            }
            while (r1.equalsIgnoreCase("yes")) {
                System.out.println("What size room would you like to reserve?");
                room = input.next();
                System.out.println("How many nights would you like to stay?");
                nights = input.nextInt();
                System.out.println("Would you like to reserve another room?");
                r1 = input.next().toLowerCase();

                if (room.equalsIgnoreCase("King")) {
                    sum += 120 * nights;
                } else if (room.equalsIgnoreCase("Queen")) {
                    sum += 100 * nights;
                } else {
                    sum += 80 * nights;
                }
                System.out.println("Total room 1: " + sum);

                while (!(r1.equalsIgnoreCase("yes") || r1.equalsIgnoreCase("no"))) {
                    System.out.println("Invalid entry, please enter if you would like to reserve a room:");
                    r1 = input.next().toLowerCase();
                }
            }
            if (r1.equalsIgnoreCase("no")) {
                System.out.println("Total room 2: " + sum);
                break;
            }
        }

    }


}
