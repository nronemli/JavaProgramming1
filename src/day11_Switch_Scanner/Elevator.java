package day11_Switch_Scanner;

import java.util.Scanner;

public class Elevator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a floor Number:");
        int number = input.nextInt();
        switch (number) {
            case 1:
                System.out.println("Floor 1 selected.\nCompanies: Lobby, Verizon, Starbucks ");
                break;
            case 2:
                System.out.println("Floor 2 selected.\nCompanies: Cybertek, NASA, Intelsat");
                break;
            case 3:
                System.out.println("Floor 3 selected.\nCompanies: Lyft, BofA, Stake house");
                break;
            default:
                System.out.println("Invalid Floor - " + number);

                input.close();
        }


    }


}
