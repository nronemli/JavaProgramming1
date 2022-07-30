package day18_NestedLoop;

import java.util.Scanner;

public class OddAndEven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        while (true) {
            System.out.println("Enter a number:");
            int num = input.nextInt();

            if (num % 2 == 0) {
                System.out.println(num + " is even number");
            } else {
                System.out.println(num + " is odd number");
            }

            System.out.println("Would you like to enter another number");
            String a = input.next().toLowerCase();

            while(!(a.equals("yes")) || (a.equals("no") ) ) {
                System.out.println("Please re enter,Would you like to enter another number");
                a = input.next().toLowerCase();

            }
                if (a.equals("no")) {
                    break;
                }
            }
            input.close();

        }


    }



