package day16_DayLoopsStringPractice;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "aabbcc";
        //abc

        String result = "";//abc
        //  i <=7 >> i<8
        for (int i = 0; i < str.length(); i++) {
            //i: represents the index numbers starting from all index no of str, starting from 0
            String ch = "" + str.charAt(i);

            if (!result.contains(ch)) {
                result += ch;
            }
        }
        System.out.println("Result = " + result);
    }
}
