package day10_NestedIf;


public class GradeLevel {
    public static void main(String[] args) {

        int num = 10;
        String grade = ""; //num 1-18

        if (num >= 1 && num <= 18) {
            if (num >= 1 && num <= 5) {
                grade = "Elementary school";
            } else if (num >= 6 && num <= 8) {
                grade = "Middle school";
            } else if (num >= 9 && num <= 12) {
                grade = "High school";
            } else if (num >= 13 && num <= 16) {
                grade = "College";
            } else {
                grade = "Grad School";
            }
        } else {
            System.out.println("INVALID GRADE");
        }

        System.out.println(grade);

    }


}
