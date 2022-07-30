package day24_CustomMethodsReturnMethod;

public class ReturnStatement2 {


    //3. Create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonth(int number) {

        if(number<1 || number>12) {
            System.out.println("Invalid");
            return; //exits the method ,remaining code fragmants of the method never gets executed
        }

        String name = (number == 1) ? "Jan" : (number == 2) ? "Feb" : (number == 3) ? "Mar" : (number == 4) ? "Apr"
                    : (number == 5) ? "May" : (number == 6) ? "June" : (number == 7) ? "July" : (number == 8) ? "Aug"
                    : (number == 9) ? "Sep" : (number == 10) ? "Oct" : (number == 11) ? "Nov" : "December";


        System.out.println("Month Name: " + name);
    }

    public static void main(String[] args) {
        nameOfMonth(3);
    }



}
