package day22_MultiDimentionalArray;

import java.util.Arrays;

public class ReverseSecondWord {
    public static void main(String[] args) {

        //interview question
        //reverse the second word love
        String str = "I love Java";
        //split all sentence in a word by using space split
        String[] word = str.split(" ");

        String reverse = "";

        for (int i = word[1].length() - 1; i >= 0; i--) {
            reverse += word[1].charAt(i);
        }
        System.out.println(reverse);

        //   str = str.replaceFirst(word[1],reverse);
        word[1] = reverse;
        System.out.println(Arrays.toString(word));

        //print each elements in the array
        for (String each : word) {
            System.out.println(each + " ");
        }

    }
}
