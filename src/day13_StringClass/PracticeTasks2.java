package day13_StringClass;

import java.util.Scanner;

public class PracticeTasks2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word:");
        String word = input.nextLine();

        int length = word.length();

        if (length == 0) {
            System.out.println("String is empty");
        }
        if (length >= 3) {
            char last3 = word.charAt(word.length() - 3);
            char last2 = word.charAt(word.length() - 2);
            char last1 = word.charAt(word.length() - 1);
            String result = last3 + "" + last2 + last1;
            System.out.println(result);
        }
        if (length <= 3) {
            System.out.println(word);
        }
        input.close();
    }
}
