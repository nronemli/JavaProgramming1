package day14_Strings;

import java.util.Scanner;

public class D14Task5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = input.next();
        char firstChar = word.charAt(0);

        if(firstChar>= '0'&& firstChar<='9'){
            System.out.println("First character is digit");
        }else if(firstChar>='a' && firstChar <= 'z'){
            System.out.println("First character is lowercase");
        } else if (firstChar>='A'&& firstChar<='Z') {
            System.out.println("First character is uppercase");
        }else
        {
            System.out.println("Special case ");
        }
        input.close();
    }


    }




