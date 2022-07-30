package day12_Scanner;

import java.util.Scanner;

public class HowManyPeople {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many people live with you ? ");
        int people = input.nextInt();
        String result = "";

        if (people <= 2) {
            result = "Live with less than 3 people";
        } else if (people >= 3 && people <= 6) {
            result = "Live with 3-6 people";
        } else {
            result = "Live with more than 6 people";
        }

        System.out.println(result);
        input.close();
    }
}