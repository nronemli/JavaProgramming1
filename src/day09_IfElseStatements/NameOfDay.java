package day09_IfElseStatements;

public class NameOfDay {
    public static void main(String[] args) {
        int n = 2; //1-7
        String day = null;

        //multi-branch if statements are greater than 2
        if (n == 1) {
            day = "Monday";
            //System.out.println("Monday");
        } else if (n == 2) {
            //System.out.println("Tuesday");
            day = "Tuesday";
        } else if (n == 3) {
            day = "Wednesday";
            //System.out.println("Wednesday");
        } else if (n == 4) {
            System.out.println("Thursday");
        } else if (n == 5) {
            System.out.println("Friday");
        } else if (n == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Sunday");
        }

        System.out.println(day);
    }


}
