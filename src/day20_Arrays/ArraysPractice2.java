package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice2 {

    public static void main(String[] args) {


        char[] letters = new char[26];

        char ch = 'A';

        for (int i = 0; i < letters.length; i++) {
            letters[i] = ch;
            ch++;
        }
        System.out.println(Arrays.toString(letters));
    }
}
