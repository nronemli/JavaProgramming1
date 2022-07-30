package day09_IfElseStatements;

public class GradeReport {
    public static void main(String[] args) {

        System.out.println(true == !false); //true
        System.out.println(!true != false); //false
        System.out.println(!false == true); //true
        System.out.println(!!false); //false
        System.out.println(!!!true); //false


        System.out.println("----------------------------");
        int score = 85; //0-100

        boolean a = score >= 90 && score <= 100;
        boolean b = score >= 80 && !a; //if score is not a but greater than 80
        boolean c = score >= 70 && !b;
        //boolean c= !a & !b & score >=70
        boolean d = score >= 60 && score <= 69;
        boolean e = !a && !b && !c && !d;


        if (a) {
            System.out.println("Excellent");
        }

        if (b) {
            System.out.println("Great");
        }

        if (c) {
            System.out.println("Good");
        }
        if (d) {
            System.out.println("Passed");
        }

        if (e) {
            System.out.println("Failed");
        }


    }

}






