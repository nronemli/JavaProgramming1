package day19_LoopPractices;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\"Enter your score\"");
            int score = input.nextInt();

            while (!(score >= 0 && score <= 100)) {
                System.err.println("Invalid Score");
                System.exit(0);
            }
            if (score >= 90 && score <= 100) {
                System.out.println("A");
            } else if (score >= 80 && score <= 89) {
                System.out.println("B");

            } else if (score >= 70 && score <= 79) {
                System.out.println("C");

            } else if (score >= 60 && score <= 69) {
                System.out.println("D");

            } else {
                System.out.println("F");
            }

            System.out.println("Would you like to continue");
            String answer = input.next();

            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                System.err.println("Invalid entry please re-enter: ");
                answer = input.next();
                break;
            }

            if (answer.equalsIgnoreCase("no")) {
                System.out.println("\"Thank you for using Cydeo Grade Calculator APP\"");
                break;
            }
        }
    }
}
