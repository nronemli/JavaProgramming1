package day16_DayLoopsStringPractice;

public class Task4 {
    public static void main(String[] args) {

        String str = "Java Java Java Java";

        int total = 0;

        for (int i = 0; i < str.length() - 3; i++) { //maximum i =7
            String word = str.substring(i, i + 4); //start at i, and increase ending by
            // i+4 so we get 4 characters JAVA
            //max i = 7, subtract same amount in loop for no error
            //   System.out.println("word = " + word);
            if (word.equalsIgnoreCase("Java")) {
                total++;
            }
        }
        System.out.println("total = " + total);

    }
}
