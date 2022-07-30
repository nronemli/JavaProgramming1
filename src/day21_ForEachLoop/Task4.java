package day21_ForEachLoop;

public class Task4 {
    public static void main(String[] args) {

        String sentence = "Java Java Phyton C++ C++ Java";
        String[] splitWord = sentence.split(" ");

        int countJava = 0;
        int countPhyton = 0;

        for (String each : splitWord) {

            if (each.contains("Java")) {
                countJava++;
            }
            if (each.contains("Phyton")) {
                countPhyton++;
            }
        }
        System.out.println("There are " + countJava + " Java words and " + countPhyton + " Phyton words");


    }
}
