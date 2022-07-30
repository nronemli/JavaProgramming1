package day19_LoopPractices;

import java.beans.beancontext.BeanContextChild;

public class FirstDuplicated {

    public static void main(String[] args) {

        String str = "abccdeef";
        String result = "";
        int count = 0;
        int firstIndex = 0;

        for (int j = 0; j < str.length(); j++) {   //A
            char ch = str.charAt(j);
            for (int i = 0; i < str.length(); i++) { //A
                char each = str.charAt(0);
                if (each == ch) {
                    count++; //count = 1 1
                }
            }
                if (count > 1) {
                    firstIndex = str.indexOf(ch);
                    System.out.println("First index: " + firstIndex);
                    break;
                }

            }

        /*
        Write a program that can return the first duplicated character from a string
         */
    }


}
