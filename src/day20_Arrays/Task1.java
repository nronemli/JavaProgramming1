package day20_Arrays;

import java.sql.Array;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        String[] names = {"James Ryan", "Phillip Scofield", "Katie Henderson", "Nur Sabr", "Selim Young", "Richard Emin",
        "Mary Rose", "Sebastian Wood","Isla Port", "Josie Mad"};

        System.out.println("--------FOR LOOP--------- ");

        for (int i = 0; i < names.length; i++) {
            char fInitial = names[i].toString().charAt(0);
            char lInitial= names[i].charAt(names[i].indexOf(" ")+1);
            System.out.println(fInitial+ " "+lInitial);
        }
        System.out.println("-------FOR EACH LOOP---------");

        for (String eachName : names) {
            String initials = eachName.charAt(0)+"."+eachName.charAt(eachName.indexOf(" ")+1);
            System.out.println(initials);
        }



    }
}










