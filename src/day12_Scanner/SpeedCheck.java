package day12_Scanner;

import java.util.Scanner;

public class SpeedCheck {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int speedLimit = 55;
        System.out.println("Enter your current speed limit: ");
        int currentLimit = input.nextInt();

        String result = (currentLimit >= 55) ? "You are driving " + (currentLimit - speedLimit) +
                " mph over the limit. Slow down!" : "";
        System.out.println(result);
        input.close();
    }
}
