package day23_CustomMethod_Void;

public class CustomMethodsWithParameters {


    public static void oddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }
    }

    public static void ageOfPerson(int birthYear, int year) {

        int age = year - birthYear;
        System.out.println("Your age is " + age);
    }

    public static void printNumbers(int x, int y){

    }

    public static void main(String[] args) {

        oddOrEven(10);
        ageOfPerson(2012, 2022);

    }

}
