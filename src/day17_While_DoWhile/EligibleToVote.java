package day17_While_DoWhile;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = input.nextInt();
        while (!(age > 1 || age > 120)) {
            System.out.println("Invalid entry, please enter valid age");
            age = input.nextInt();
        }

        System.out.println("Are you a US citize? yes/no?");
        String answer = input.next().toLowerCase();

        while (!(answer.equals("yes")||answer.equals("no"))){
            System.out.println("Invalid entry");
            answer = input.next().toLowerCase();
        }

input.close();





    }
}
