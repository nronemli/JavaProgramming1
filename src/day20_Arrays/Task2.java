package day20_Arrays;


import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {


        String classMates[] = {"Nur", "Seb", "Larry", "Michael", "Katy",
                "Lucy", "Philip", "Rosetta", "Charles", "Catherine"};

        String reverseName = "";
        System.out.println("---------FOR LOOP SOLUTION----------");

        for (int i = 0; i < classMates.length; i++) {
            String name = classMates[i];
            for (int i1 = name.length() - 1; i1 >= 0; i1--) {
                reverseName += name.charAt(i1);
            }
            System.out.println(reverseName);
        }

        System.out.println("---------FOR EACH LOOP SOLUTION----------");

        for (String eachName : classMates) {
            String reversed = "";

            for (int i = eachName.length() - 1; i >= 0; i--) {
                reversed += eachName.charAt(i);

            }

            System.out.println(reversed);
        }


    }
}
