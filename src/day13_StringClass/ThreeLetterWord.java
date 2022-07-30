package day13_StringClass;

import java.util.Scanner;

public class ThreeLetterWord {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter three letter word: ");
        String word = input.next();

        if (word.length() > 3) {
            System.out.println("Word is too long");
        } else if (word.length() < 3) {
            System.out.println("Word is too short");
        } else {
            char middleCharacter = word.charAt(1);
            if (middleCharacter == 'a') {
                System.out.println("cool word");
            } else {
                System.out.println("okay word");
            }
        }
    }
}
