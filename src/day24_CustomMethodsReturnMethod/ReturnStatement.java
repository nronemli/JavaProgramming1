package day24_CustomMethodsReturnMethod;

public class ReturnStatement {

    public static void main(String[] args) {
        nameOfDay(8);
    }



    public static void nameOfDay(int number) {
        String name = "";
        if (number >= 1 && number <= 7) {
            name = (number == 1) ? "Mon" : (number == 2) ? "Tue" : (number == 3) ? "Wed" : (number == 4) ? "Thur"
                    : (number == 5) ? "Fri" : (number == 6) ? "Sat" : "Sun";
        } else {
            System.out.println("Invalid");
            return; //exits nameOfDay method
        }
        System.out.println("Name of day: " + name);
    }

}
