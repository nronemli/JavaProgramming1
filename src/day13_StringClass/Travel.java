package day13_StringClass;

import java.util.Scanner;

public class Travel {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Do you have a valid passport?(Yes/No)");
        String validPass = input.next();
        int baseCost;
        if (validPass.equals("Yes")) {
            baseCost = 1000;
            System.out.println("Which country would you like to travel?");
            String country = input.nextLine();
            input.nextLine();
            System.out.println("How many bags will you take?");
            byte numberOfBags = input.nextByte();
            System.out.println("How many people would you like to travel with?");
            short people = input.nextShort();
            System.out.println("Names of people travelling: ");
            input.nextLine();
            String namesOfPeople = input.nextLine();
            int bagTotal = numberOfBags * 50;
            int peopleTotal = people * 100;
            int costAmount = (baseCost - peopleTotal) + bagTotal;

            System.out.println("Your ticket is booked to " + country + "." + "We have charged extra for the " + numberOfBags +
                    " bags but you are travelling with " + namesOfPeople + " so we are giving you a discount.");
            System.out.println("Your total cost is " + costAmount + ".");
        } else {
            baseCost = 200;
            System.out.println("How many years has your passport expired? ");
            int passExpiry = input.nextInt();
            System.out.println("Which country would you like to travel?");
            String country1 = input.next();
            input.nextLine();
            System.out.println("Would you like to travel next year?(Yes/no)");
            String yearTravel = input.next();

            int totalCost;
            int expireCost = passExpiry*75;
            if (yearTravel.equals("Yes")) {
                totalCost = +100;
            } else {
                totalCost =-50;
            }
            int costNo = baseCost+totalCost + expireCost;


            System.out.println("Looks like your passport has been expired for " + passExpiry + ",but dont worry " +
                    "we will get it ready for you to travel to " + country1 + ". Your total cost has come out to " + costNo);


        }

            input.close();
    }
}