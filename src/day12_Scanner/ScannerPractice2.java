package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // System.out.println("Enter true or false");
        //boolean result = input.nextBoolean();
        System.out.println("Enter full name: ");
        String name = input.next(); //only use for one word input including any space

        System.out.println("Name = " + name);

        input.close();
    }


}
