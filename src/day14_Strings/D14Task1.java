package day14_Strings;

import java.util.Scanner;

public class D14Task1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter two words:");
        String firstWord = input.next();
        String secondWord = input.next();

        String first = firstWord.substring(1);
        String second = secondWord.substring(1);
        System.out.println(first + second);

        System.out.println("_______________________________");
        input.close();
    }


}
