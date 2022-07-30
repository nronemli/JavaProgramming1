package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FirstLastElements {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));

        Collections.swap(list, 0, list.size() - 1);
        System.out.println(list);

        System.out.println("------warmup2-----------------------------");

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list) {
            if (each != 0) {
                result.add(each);
            }
        }
        System.out.println(result);

        for (Integer each1 : list) {
            if (each1 == 0) {
                result.add(each1);
            }
        }
        System.out.println(result);

        System.out.println("-------warmup3--------------------");

        String str = "ABCD123%^^&&^%$456EFG";
        ArrayList<Character> chars = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            chars.add(str.charAt(i));
        }
        ArrayList<Character> letters = new ArrayList<>(chars); //add all characters
        letters.removeIf(p-> !Character.isLetter(p)); //remove characters that are not leters
        System.out.println("letters = " + letters);

        ArrayList<Character>digits =new ArrayList<>(chars); // added all the characers
        digits.removeIf(p-> !Character.isDigit(p));
        System.out.println("digits = " + digits);

        ArrayList<Character> specialChars= new ArrayList<>(chars);
        specialChars.removeAll(letters);
        specialChars.removeAll(digits);
        System.out.println("specialChars = " + specialChars);
    }
}

