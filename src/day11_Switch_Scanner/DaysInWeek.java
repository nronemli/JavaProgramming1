package day11_Switch_Scanner;

public class DaysInWeek {
    public static void main(String[] args) {

        int number = 4;
        //cannot use long, float, double, boolean
        //switch statement only accepts int, char, string
        //switch statement is not as powerful as if statements but faster than if
        //<= >= cannot be used for any other boolean expression only ==
        switch (number) { //1,2,3,4,5,6,7 == can be used)
            case 1: //case value has to be unique each time
                System.out.println("Monday");
                break; //exist the switch after executing the case block
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");
                break;
        }


    }


}
