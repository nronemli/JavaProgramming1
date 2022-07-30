package day16_DayLoopsStringPractice;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        /*
        String str = "aabcccd";
        int result=0;

        for (int i = 0; i < str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'e'){
                result++;
            }
        }
        System.out.println("result = " + result);

        */

        Scanner input = new Scanner(System.in);

       // String ch;
        String str;
        int result = 0;

        System.out.println("Enter a sentence");
        str = input.nextLine();
        System.out.println("Enter a character");
        char ch = input.next().charAt(0);

        /*
        < str.length();
Index number is always less than length of the string.
         */
        for (int i = 0; i < str.length(); i++) { //i :indexes of string
            char ch1 = str.charAt(i); //will get each character of string every time it runs the loops
            if(ch1==ch){ //once getting each character compare if it equals to the given character
                result++; //increase the frequency result by 1
            }
        }
        System.out.println("result = " + result); //print the incremented result
    }
}
