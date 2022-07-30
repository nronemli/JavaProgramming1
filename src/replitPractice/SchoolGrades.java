package replitPractice;
import java.util.Scanner;

public class SchoolGrades {
         public static void main(String[] args) {
            // Enter your code here
            Scanner input = new Scanner(System.in);
            System.out.println("Welcome to the Grader!");
            System.out.println("Please enter subject name number 1 and score for this subject");
            String grade1 = input.nextLine();
            double g1 = input.nextDouble();
            input.nextLine();
            System.out.println("Please enter subject name number 2 and score for this subject");
            String grade2 = input.nextLine();
            double g2 = input.nextDouble();
            System.out.println("Please enter subject name number 3 and score for this subject");
            String grade3 = input.nextLine();
            input.nextLine();
            double g3 = input.nextDouble();
            System.out.println("Please enter subject name number 4 and score for this subject");
            String grade4 = input.nextLine();
            input.nextLine();
            double g4 = input.nextDouble();
            System.out.println("Please enter subject name number 5 and score for this subject");
            String grade5 = input.nextLine();
            input.nextLine();
            double g5 = input.nextDouble();

            System.out.println("Summary: "+grade1+" - "+g1+", "+grade2+" - "+g2+", "+grade3+" - "+g3+", "+grade4+" - "+g4+", "+grade5+" - "+g5);

            System.out.println("Your average score is: " + (g1 + g2 + g3 + g4 + g5) / 5);
            System.out.println("Thank you for using Grader!\nGoodbye!");

        }
    }




