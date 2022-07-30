package day14_Strings;

import java.util.Scanner;

public class D14Task3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = input.next();


        if (word.substring(0,1).equals("x")) {
            System.out.println(word.substring(1));
        }else {
            System.out.println(word);
        }
    }
}





