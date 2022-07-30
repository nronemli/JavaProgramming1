package day24_CustomMethodsReturnMethod;

public class ReturnMethodsPractice3 {


    public static int frequency(String str, char ch) {
        int count = 0;
        for (char each : str.toCharArray()) {
            if (each == ch) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        String str = "aabccdee";

        //finding unique characters from string
        for (int i = 0; i < str.length(); i++) {
            int frequency = frequency(str, str.charAt(i));
            if (frequency == 1) {
                System.out.println(str.charAt(i));
            }
        }

    }


}
