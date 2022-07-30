package day17_While_DoWhile;

import java.util.Scanner;

public class DoWhileLoopIntro {

    public static void main(String[] args) {

        boolean a = false;
        //if you know how many times it needs to get executed
        for (int i = 0; a; ) {
            System.out.println("Wooden Spoon - for loop");

        }
        while (a) {
            System.out.println("Wooden Spoon");
        }
        //do block gets executed first
        //will print wooden spoon first then check condition
        do {
            System.out.println("Wooden Spoon");
        } while (a); //condition is true then do block will repeated again
        //if the condition is not true
        System.out.println("----------------------------------");
        for (int i = 0; i <= 10; i++) { // repeat loop at given number of times
            System.out.print(i + " ");
        }
        int j = 1; //give initialisation first
        while (j <= 10) {
            System.out.print(j + " ");
            j++; //iterations at the end in while loop
        }

        System.out.println("-----------------------------------");
        for (char i = 'A'; i <= 'Z'; i++) {
            if (i == 'F') {
                break; //exits the loop checks condition and exits,
                // then prints
            }
            System.out.print(i + " ");
        }

        System.out.println("------------------------");

        Scanner input =new Scanner(System.in);
            while(true){
                System.out.println("Enter a number");
                int num= input.nextInt();
                if(num<0){
                    break;
                }
        }
input.close();

    }
}
