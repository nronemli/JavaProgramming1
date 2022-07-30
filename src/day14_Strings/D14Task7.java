package day14_Strings;

import java.util.Scanner;

public class D14Task7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter email:\n(First name_lastname@email.com)");
        String email = input.next();

        if (email.contains("_")) {
                                  //substring(begin index, ending index)
            String fName = email.substring(0,(email.indexOf("_")));
                          //email.substring(0,(email.indexOf("_")));
            String lName = email.substring(email.indexOf("_") +1, email.indexOf("@"));
                                   //substring(begin index,           ending index)
            String end = email.substring(email.indexOf("@"));
                                    //substring(begin index, continue till end)
            System.out.println(lName + "_" + fName + end);
        } else {
            System.out.println(email);
        }
        input.close();







    }

}
