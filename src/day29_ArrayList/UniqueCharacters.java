package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "aaabccdeeef";

        String []arr= str.split("");

        //convert the string to array LIST
        //split: returns string array
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr)); //contains each characters of the string
        System.out.println(list);

        String unique = "";
        for (String eachElement : list) {
            int frequency = Collections.frequency(list, eachElement);
            if (frequency == 1) {
                unique += eachElement;
            }
        }
        System.out.println("unique = " + unique);
    }
}
