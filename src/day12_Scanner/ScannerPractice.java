package day12_Scanner;

//import java.util.*   //imports everything from the package

import java.util.Scanner; // write scanner after main this will automatically come up

public class ScannerPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 7: ");
        int number = input.nextInt();
        String result = "";

        if (number >= 1 && number < 7) { //number 1-7
            switch (number) {
                case 1:
                    result = "Monday";
                    break;
                case 2:
                    result = "Tuesday";
                    break;
                case 3:
                    result = "Wednesday";
                    break;
                case 4:
                    result = "Thursday";
                    break;
                case 5:
                    result = "Friday";
                    break;
                case 6:
                    result = "Saturday";
                    break;
                default: //if the number is 7
                    result = "Sunday";
                    break;
            }

        } else {
            System.out.println("Invalid number!");
        }
        input.close();
        System.out.println(result);
    }

}
