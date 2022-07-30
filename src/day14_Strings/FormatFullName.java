package day14_Strings;

public class FormatFullName {

    public static void main(String[] args) {

        String firstName = "cyDeo",
                lastName = "SCHOOL";

        // firstName.charAt(0);

        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        System.out.println(firstName);

       lastName= lastName.substring(0,1).toUpperCase()
               +lastName.substring(1).toLowerCase();
        System.out.println(lastName);


    }


}
