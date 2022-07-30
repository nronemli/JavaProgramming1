package day17_While_DoWhile;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        String total = "";
        System.out.println("Would you like to reserve a room?:");
        String room = input.next();
        if (room.equals("Yes")) {
            System.out.println("Which type of room?");
            String roomType = input.next().toLowerCase();
            while (!(roomType.equalsIgnoreCase("King") ||
                    roomType.equalsIgnoreCase("Queen") ||
                    roomType.equalsIgnoreCase("Single"))) {
                System.out.println("Invalid room, please enter valid room type!");
                roomType = input.next().toLowerCase();
            }
            if (roomType.equalsIgnoreCase("King")) {
                total += 120 + "$";
            } else if (roomType.equalsIgnoreCase("Queen")) {
                total += 100 + "$";
            } else {
                total += 80 + "$";
            }
            System.out.println("total = " + total + " " + roomType);

        } else {
            System.out.println("Have a nice day!");
        }
input.close();
    }

}








/*
    5. Create a class called RommReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)


 */



