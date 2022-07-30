package day19_LoopPractices;

public class SCode {

    public static void main(String[] args) {

        String word = "abcdeffg";
        int firstIndex = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int count = 0;

            for (int j = 0; j < word.length(); j++) {
                char each = word.charAt(j);
                if (ch == each) {
                    count++;
                }
            }

            if (count > 1) {
                firstIndex = word.indexOf(ch);
                System.out.println("firstIndex = " + firstIndex);
                break;
            }
        }

    }
}





