package day20_Arrays;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {

        char[] alphabets = new char[26];  //z-a

        alphabets[0] = 'Z';
        System.out.println(Arrays.toString(alphabets)); //prints the whole array
        System.out.println(alphabets[0]); //prints the element of array


/*        i     ch
alphabet [0] = 'Z' //99 ASCI
alpahbet [1] = 'Y' //98 asci
 */
        char ch = 'Z';
        for (int i = 0; i < alphabets.length; i++, ch--) {
            alphabets[i] = ch;
        }


    }
}
