package day22_MultiDimentionalArray;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        String[][] items = {  //(n-1)
                {"Apple", "Banana", "Grape", "Avocado"}, //1
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"}, //2
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"} //3
        };

        //each id: kutulari  >>item: tir
        for (String[] each1D : items) {
                 //each: malzeme >> eachid: KUTU
            for (String each : each1D) {
                System.out.print(each + "\t");
            }
            System.out.println();
        }


        System.out.println("--------------------------");
                            //kutu
        for (int i = 0; i < items.length; i++) {
                    //malzeme
            for (int eachElement = items[i].length - 1; eachElement >= 0; eachElement--) {
                System.out.print(items[i][eachElement] + "\t");
                                    //kutu >malzeme
            }
        }
        System.out.println();
        System.out.println("--------------------------");

        for (int i = items.length - 1; i >= 0; i--) {
            for (int i1 = 0; i1 < items[i].length; i1++) {
                System.out.print(items[i][i1] + "\t");

            }
            System.out.println();
        }


    }
}
