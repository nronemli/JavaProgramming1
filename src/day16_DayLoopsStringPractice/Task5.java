package day16_DayLoopsStringPractice;

import java.util.Locale;

public class Task5 {
    public static void main(String[] args) {


        String str = "caT dog dogG cAt cat dog";
        int cat = 0;
        int dog = 0;

        for (int i = 0; i < str.length()-2; i++) {
            String word = str.substring(i, i + 3);
          System.out.println(word);
            if (word.equalsIgnoreCase("cat")) {
                cat++;
            }
            if (word.equalsIgnoreCase("dog")){
                dog++;
            }
        }
        boolean equals = cat == dog;
        System.out.println(equals);

       // System.out.println("cat = " + cat);
       // System.out.println("dog = " + dog);

    }


}
