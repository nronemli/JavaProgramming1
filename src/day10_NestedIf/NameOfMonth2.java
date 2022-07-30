package day10_NestedIf;

public class NameOfMonth2 {
    public static void main(String[] args) {
        int num = 1;

        String result = (num == 1) ? "Jan" : (num == 2) ? "Feb" : (num == 3) ? "Mar" : (num == 4) ? "Apr"
                : (num == 5) ? "May" : (num == 6) ? "June" : (num == 7) ? "July" : (num == 8) ? "Aug"
                : (num == 9) ? "Sep" : (num == 10) ? "Oct" : (num == 11) ? "Nov" : "Dec";

        System.out.println(result);


    }


}
