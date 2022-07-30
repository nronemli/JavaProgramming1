package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String name = input.nextLine();

        System.out.println("Enter your building number: ");
        int buildingNo = input.nextInt();

        input.nextLine();

        System.out.println("Enter Street name: ");
        String streetName = input.nextLine();

        System.out.println("Enter city name: ");
        String cityName= input.nextLine();

        System.out.println("Enter state: ");
        String state = input.nextLine();

        System.out.println("Zip code: ");
        String zip=input.next();

        System.out.println(buildingNo+" " +streetName+ " "+cityName+" " +state+" " +zip);
        input.close();

    }





}
