package day16_DayLoopsStringPractice;

public class Palindrome {
    public static void main(String[] args) {

        String word = "Level"; //palindrome word , when reversed its same
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        boolean isPalindrome = word.equalsIgnoreCase(reversed);
        System.out.println(reversed);


    }
}
