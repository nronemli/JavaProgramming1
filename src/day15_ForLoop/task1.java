package day15_ForLoop;

public class task1 {
    public static void main(String[] args) {

        String word = "A1B2C3";
        int sum = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch >= '0' && ch <= '9') {
                sum += ch - 48;
            }
        }
        System.out.println("sum= " + sum);
    }
}
