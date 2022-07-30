package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {
    public static void main(String[] args) {


        String[] country = {"Turkey", "England", "Germany", "Italy", "France", "United Kingdom", "United States"};
        //convert array to arrayList
        ArrayList<String> countryList = new ArrayList<>(Arrays.asList(country));

        //lambda to remove if(each -> each.legnth>=10) from country list array list
        countryList.removeIf(p -> p.length() >= 10);

        //convert array list to array        //number of array gets changed
        country = countryList.toArray(new String[0]);
        //print out the new array
        System.out.println(Arrays.toString(country));


    }
}
        /*
        Create an array of string called countries
        Write a program that can remove all country names that have length of 10 or greater
         */