package day48_Collections;

import java.beans.beancontext.BeanContextChild;
import java.util.*;

public class SetPractice {
    public static void main(String[] args) {

        String[] arr = {"Wooden Spoon", "Book", "Pen", "Wooden Spoon", "Wooden Spoon",
                "Wooden Spoon", "Wooden Spoon", "Milk", "Eggs", "Coke"};
        System.out.println("_________hashSet example______________");
        //remove duplicated objects
        System.out.println("********1 ST SOLUTUON********");
        Set<String> set1 = new HashSet<>(Arrays.asList(arr));
        System.out.println("set1 = " + set1);
        //convert back to array
        arr = set1.toArray(new String[0]); //pass 0 we are trying to convert to string array
        System.out.println(set1);
        System.out.println(Arrays.toString(arr));
        //to array : FROM COLLECTION INTERFACE
        System.out.println("*******2ND SOLUTUON********");
        arr = new HashSet<>(Arrays.asList(arr)).toArray(new String[0]);
        System.out.println(Arrays.asList(arr));

        System.out.println("_________Linked hashSet example______________");
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1000, 300, 1000, 200, 300, 400, 500, 10
                , 20, 30, 40, 30, 20, 10));
        //3)assigned back to list1 ,2)convert to arrayList  ,1)removed duplicates with linkedHashSet
        list1 = new ArrayList<>(new LinkedHashSet<>(list1));

        System.out.println(list1);

        System.out.println("_____________________________________________");
        String[] array = {"A", "A", "B", "C"};
        List<String> s = new ArrayList<>();
        s.addAll(Arrays.asList(array));

        System.out.println("____________Task:Frequency of characters __________________________");
        String str = "bbbaaaccccddddeeeeee";
        String result = ""; //a3b3c4d4e5

        for (String each : new LinkedHashSet<>(Arrays.asList(str.split("")))) {
            int count = Collections.frequency(Arrays.asList(str.split("")), each);
            result += count;
        }
        System.out.println(result);


        System.out.println("_______Task:Return 5th element, remove duplicates_____________________");
        //return the 5th element after removing the duplicates! Do not change order of elements
        Integer[] nums = {1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 1, 2, 3, 4, 5, 1, 2, 3,
                4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        nums = new LinkedHashSet<>(Arrays.asList(nums)).toArray(new Integer[0]);
        System.out.println(Arrays.toString(nums));
        System.out.println("___________________________________________");

        Set<String> names = new LinkedHashSet<>();
        names.addAll(Arrays.asList("Ahmet", "Ahmet", "John", "James", "Breanna", "Shay"));
        //convert to array and retrieve index 2
        System.out.println(names.toArray(new String[0][2]));
        //convert to arraylist and get the index
        System.out.println(new ArrayList<>(names).get(4));

        //print each elements in the array/or list
        for (String each : names) {
            System.out.println(each);
        }
    }
}