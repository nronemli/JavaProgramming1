package day14_Strings;

import java.util.Scanner;

public class D14Task2 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = input.next();


        if ((word.substring(word.length() - 2).equals("ly"))) {
            System.out.println("really");
        } else {
            System.out.println("Never mind");
        }

        input.close();
    }
}
