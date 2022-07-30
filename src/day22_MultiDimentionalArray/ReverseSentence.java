package day22_MultiDimentionalArray;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {

        String str = "Today is a good day to learn Java";
        String[] word = str.split(" ");
        String reversedSentence = "";

        for (int i = word.length - 1; i >= 0; i--) {
            reversedSentence += word[i] + " ";
        }

        System.out.println(Arrays.toString(word));
        System.out.println(reversedSentence);


    }
}
