package day29_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {


        ArrayList<Integer> list= new ArrayList<>();
        // addAll: adds collection of values to the ArrayList
        //asList(array of values): returns the array as collection type
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(list);
        System.out.println("***********************************");
        //removes the collection of values from the list
        list.removeAll(Arrays.asList(1,3,5,7,9));
        System.out.println(list);
        System.out.println("***********************************");
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(100,200,300,400,500,600,100,200,300,800,900));
        //remove all the unmatching ones in the list below
        list.retainAll(Arrays.asList(100,200,300)); //keep these and remove rest with retain all

        ArrayList<String> jobTitles= new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QA","SDET","Developer","QA","SDET","Scrum master","BA","BA"));
        jobTitles.retainAll(Arrays.asList("QA","SDET")); //REMOVE everything except these
        System.out.println(jobTitles);
        System.out.println("***********************************");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,8,9,10));
        boolean r1= nums.contains(10);
        boolean r2= nums.contains(2) && nums.contains(5) && nums.contains(10); //check if it contains this
        System.out.println("r2 = " + r2); //true
        System.out.println("r1 = " + r1); //true
        boolean r3= nums.containsAll(Arrays.asList(2,5,100)); //true : check if contains all
        System.out.println("r3 = " + r3);
        System.out.println("***********************************");

        //asList() >> CONVERT AN ARRAY TO A LIST
        //array size is fixed.
        String[] names= {"Josh", "Jack","Daniel","Shay","Brenna"};

        // ArrayList<String>namesList= new ArrayList<>();
        // namesList.addAll(Arrays.asList(names));
        ArrayList<String>namesList= new ArrayList<>(Arrays.asList(names)); // only non primitive
        System.out.println(namesList);

        System.out.println("***********************************");

        Integer[]arr= {1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer>list2= new ArrayList<>(Arrays.asList(arr));
        System.out.println(list2);


        System.out.println("****************************************");

        int[] arr2= {1,2,3,4,5,6,7,8,9,10};
        //use a custom method , to convert primivite to arrray list
        ArrayList<Integer>list3 = new ArrayList<>(convertToArrayList(arr2));
        System.out.println(list3);
    }

    //add integer array to the array list
    public static ArrayList<Integer> convertToArrayList(int[]array){
        ArrayList<Integer> list= new ArrayList<>();
        for (int each : array) {
            list.add(each);
        }
        return list;
    }
}
