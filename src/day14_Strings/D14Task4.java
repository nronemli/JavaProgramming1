package day14_Strings;

import java.util.Scanner;

public class D14Task4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter two words");
        String word1 = input.next();
        String word2 = input.next();

        String w1 = String.valueOf(word1.charAt(word1.length() - 1)); //value of the last character of string
        String w2 = String.valueOf(word2.charAt(0)); //value of first character of string

        if (w1.equals(w2)) { //if first and second string equals to each other
            System.out.println(word1 + word2.substring(1));
        } else {
            System.out.println(word1 + word2);
        }
input.close();
    }
}






