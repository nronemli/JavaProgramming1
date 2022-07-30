package day10_NestedIf;

import java.sql.SQLOutput;

public class NestedIfIntro {

    public static void main(String[] args) {
        //if you have a precondition nested-if has to be applied

        int score = 95;
        if (score > 0 && score <= 100) { //if the score is valid
            if (score >= 60) { //then check if student passed exam
                System.out.println("Passed");
            } else { //otherwise failed
                System.out.println("Failed"); //
            }
        } else { //if the score is not valid
            System.out.println("Invalid score");
        }
        System.out.println("_____________________________");

        int age = 25;
        boolean hasId = true;

        if (hasId) { //if the person has ID

            if (age >= 21) { //if the person is 21 years old and over
                System.out.println("Eligible to buy alchohol");
            } else { //if the person is less than 21 years old
                System.out.println("Not eligible");
            }
        } else { //if the person has not an id
            System.out.println("No ID to buy alchocol");
        }

        System.out.println("______________________________");

        int number = 5;

        if (number >= 1 && number <= 7) { //if the number is between 1-7
            if (number == 1) { //if the number is equal to 1
                System.out.println("Monday");
            } else if (number == 2) {
                System.out.println("Tuesday");
            } else if (number == 3) {
                System.out.println("Wednesday");
            } else if (number == 4) {
                System.out.println("Thursday");
            } else if (number == 5) {
                System.out.println("Friday");
            } else if (number == 6) {
                System.out.println("Saturday");
            } else {
                System.out.println("Sunday");
            }
        } else {
            System.out.println("Invalid Number");
        }


    }


}
