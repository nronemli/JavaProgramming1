package day24_CustomMethodsReturnMethod;

public class WarmUpTasks {

    //    1. Create a method that can display the initials of the person
    public static void initials(String fName, String lName) {
        String initial = fName.charAt(0) + " " + lName.charAt(0);
        initial = initial.toUpperCase();
        System.out.println("Initial : " + initial);
    }

    //2. Create a method that can display the domain of the email
    public static void domain(String email) { //nuronemli@gmail.com
        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println("domain: " + domain);
    }

    //3. Create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonth(int number) {
        String name = "";
        if (number >= 1 && number <= 12) {
            name = (number == 1) ? "Jan" : (number == 2) ? "Feb" : (number == 3) ? "Mar" : (number == 4) ? "Apr"
                    : (number == 5) ? "May" : (number == 6) ? "June" : (number == 7) ? "July" : (number == 8) ? "Aug"
                    : (number == 9) ? "Sep" : (number == 10) ? "Oct" : (number == 11) ? "Nov" : "December";
        } else {
            System.out.println("Invalid");
        }
        System.out.println("Month Name: " + name);
    }

    //4. Create a method that can print the name of the day based on the given number to the method
    public static void nameOfDay(int number) {
        String name = "";
        if (number >= 1 && number <= 7) {
            name = (number == 1) ? "Mon" : (number == 2) ? "Tue" : (number == 3) ? "Wed" : (number == 4) ? "Thur"
                    : (number == 5) ? "Fri" : (number == 6) ? "Sat" : "Sun";
        } else {
            System.out.println("Invalid");
        }
        System.out.println("Name of day: " + name);
    }

    //	5. Create a method that can print how many days a month has

    public static void howManyDays(int number){

    }





    public static void main(String[] args) {
        initials("Aynur", "Onemli");
        domain("nuronemli@gmail.com");
        nameOfMonth(6);
        nameOfDay(2);
    }
}
