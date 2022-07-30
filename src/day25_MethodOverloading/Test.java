package day25_MethodOverloading;

import utilities.StringUtility;

public class Test {

    public static void main(String[] args) {


        String str = "Java Programming language";
        StringUtility.printEachChar(str);

        String s1 = "Wooden spoon";
        String reverse = StringUtility.reverse(s1);
        System.out.println(reverse);

        String word = "Level";
        boolean palindrome = StringUtility.isPalindrome(word);
        System.out.println("palindrome = " + palindrome);

        System.out.println("*******************************");

        String[] names = {"Anna", "Java", "Phyton", "racecar", "Cydeo"};

        int count = 0;
        for (String eachName : names) {
            if (StringUtility.isPalindrome(eachName)) {
                count++;
            }
        }
        System.out.println(count);

        System.out.println("**********************************");
        String s2 = "aaabbbbcccddddeeef";
        String nonDup = StringUtility.removeDuplicates(s2);
        System.out.println(nonDup);


    }

}
