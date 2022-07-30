package day35_Encapsulation.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {
    public static void main(String[] args) {

        ArrayList<Candies> candyList = new ArrayList<>();
        candyList.addAll(Arrays.asList(new Candies("Oreo",2,2.3,true)));
        candyList.addAll(Arrays.asList(new Candies("Lolipop",4,3.4,false)));
        candyList.addAll(Arrays.asList(new Candies("Cookie",2,1,true)));
        candyList.addAll(Arrays.asList(new Candies("Rock",1,1.5,false)));

        for (Candies eachCandies : candyList) {
            System.out.println(eachCandies.getBrand()+ ", price: " + eachCandies.getPrice());
        }
    }
}


/*
 1.2 Create a class named CandyFactory
                Create an ArrayList of candies
                Add five objects of candies
                use for each loop to print the brand and price of each candy
 */