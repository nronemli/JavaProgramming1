package day51_Map;

import java.lang.reflect.Array;
import java.util.*;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "bbcccaaaa";
        String[] arr = str.split("");
        Map<String, Integer> result = new LinkedHashMap<>();
        for (String eachChar : arr) {
            int frequency = Collections.frequency(Arrays.asList(arr),eachChar);
            result.put(eachChar, frequency);
        }

        System.out.println(result);

    }
}
