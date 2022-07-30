package day10_NestedIf;

public class Grade {
    public static void main(String[] args) {

        char grade = 'A';
        String result = "";
        boolean validGrade = (grade >= 'A' && grade <= 'D') || grade == 'F';

        if (validGrade) {
            if (grade == 'A') {
                result = " excellent";
            } else if (grade == 'B') {
                result = " great job";
            } else if (grade == 'C') {
                result = " good";
            } else if (grade == 'D') {
                result = " passed";
            } else {
                result = " failed";
            }
        } else {
            result = " Invalid";
        }

        System.out.println("'" + grade + "' :" + result);
    }


}
