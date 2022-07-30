package day17_While_DoWhile;


public class FrequencyOfWord_WhileLoop {
    public static void main(String[] args) {


        String str = "Java Java Java Phyton";

        int frequency = 0;

        while (str.contains("Java")) {
            str = str.replace("Java", "");
            frequency++;
        }
        System.out.println(frequency);
        System.out.println(str);
    }

//input.close();

}
