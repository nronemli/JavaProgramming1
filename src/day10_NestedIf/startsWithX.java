package day10_NestedIf;

import java.util.Scanner;

public class startsWithX {


    public static void main(String[] args) {

        System.out.println("Enter a word");
        String word = new Scanner(System.in).next(); //can use it if only one input is needed

        if(word.charAt(0) == 'x'){
         word= word.replaceFirst("x","a");
            System.out.println(word);
        }
        System.out.println(word);
    }
}
