package day7_Operators;

public class LeapYear {
    public static void main(String[] args) {


        int year = 2020;
        int remainder = year % 4; //check to see if it's a leap year by diving into 4 without remainder

        boolean isLeapYear = remainder == 0; //if the remainder is equal to 0 than its a leap year

        System.out.println(year + " is a leap year : " + isLeapYear);


    }


}
