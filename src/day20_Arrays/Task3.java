package day20_Arrays;

import java.util.Arrays;


public class Task3 {
    public static void main(String[] args) {

        String[] items = {"Shoes", "Jacket", "Gloves", "AirPods", "iPad", "iPhone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};


        int index = 0;
        String sum = "";

                    //0 SHOES
        //1 JACKET
        //2 GLOVES
        for (int i = 0; i < items.length; i++) {
            String itemName = items[i];
            double itemPrice = prices[i];
            int itemNo = itemIDs[i];

            if (itemName.equals("AirPods")) {
                index = i; //INDEX = 2
            }

            if(itemName.equals("iPad")){
                boolean hasIPad = true;
            }


            sum += itemName + " - " + itemPrice + " - " + itemNo+"\n";

        }

        System.out.println(index);

        System.out.println(sum);
/*
        int gloves = items.toString().indexOf("Glo");
        System.out.println(gloves);

        boolean hasIpad = items.toString().toLowerCase().equals("iPad");
        System.out.println(hasIpad);
*/


    }
}
