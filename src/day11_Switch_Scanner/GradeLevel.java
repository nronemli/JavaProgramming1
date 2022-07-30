package day11_Switch_Scanner;

public class GradeLevel {
    public static void main(String[] args) {


        byte grade = 1;
        String result = "";

        if (grade >= 1 && grade <= 18) { //1-18
            switch (grade) {
                case 6:
                case 7:
                case 8:
                    result = "Middle school";
                    break;
                case 9:
                case 10:
                case 11:
                case 12:
                    result = "High School";
                    break;
                case 13:
                case 14:
                case 15:
                case 16:
                    result = "College";
                    break;
                case 17:
                case 18:
                    result = "Grad School";
                default: //1-5
                    result = "Elementary school";
                    break;

            }
        } else {
            result = "Invalid grade";
        }

        System.out.println(result);

        System.out.println("___________________________________");






    }
}
