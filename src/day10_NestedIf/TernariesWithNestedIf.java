package day10_NestedIf;

public class TernariesWithNestedIf {
    public static void main(String[] args) {

        int score = 56;

        String result = (score >= 0 && score <= 100) ? (score >= 60) ? "Passed" : "Failed"
                : "Invalid score";
        System.out.println(result);


    }


}
