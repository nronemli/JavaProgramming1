package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String str = "Java";
        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars)); //list the chars in the array [J,A,V,A]

        for (char each : chars) { //access to each characters in the array
            System.out.println(each); //PRINT each char in a  new line
        }
        System.out.println("----------------------------");

        String sentence = "I love learning java programming language";
        String[] words = sentence.split(" "); //split words from each spaces
        System.out.println(Arrays.toString(words));

        System.out.println("------------------------------");

        String email = "WoodenSpoon@cydeo.com";

        String[] arr = email.split("@");
        System.out.println(Arrays.toString(arr));







    }
}
