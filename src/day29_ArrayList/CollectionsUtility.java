package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CollectionsUtility {

    public static void main(String[] args) {

        System.out.println("*****************sort()***************");
        //sort()
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1));

        Collections.sort(list);
        System.out.println(list); //ascending ordeR: smallest to biggest sortd

        System.out.println("****************reverse()**************");
        //reverse()
        ArrayList<Character> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList('A', 'B', 'C', 'D', 'E'));
        System.out.println(list2);
        Collections.reverse(list2); //array list reversed
        System.out.println(list2);
        System.out.println("****************swap()****************");

        //swap()
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(10, 20, 30, 40, 50, 60, 70));
        Collections.swap(list3, 1, 4);
        System.out.println(list3);

        System.out.println("****************max()****************");
        int max = Collections.max(list3);
        System.out.println("min number: " + max);
        System.out.println("****************min()****************");
        int min = Collections.min(list3);
        System.out.println("min number: " + min);

        System.out.println("****************replaceAll()****************");
        ArrayList<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(10, 10, 20, 30, 40, 50, 10, 10, 10));
        //replaces all values with specific value
        Collections.replaceAll(list4, 10, 100);
        System.out.println(list4);
        System.out.println("****************frequency()****************");
        //it works with all array lists , int ,string etc...
        int frequency = Collections.frequency(list4, 100); //return type int
        System.out.println("frequency = " + frequency); //5

        ArrayList<String> word = new ArrayList<>();
        word.addAll(Arrays.asList("Java", "Java", "Phyton", "Phyton", "C++", "HTML"));
        int frequencyJava = Collections.frequency(word, "Java");
        int frequencyPhyton = Collections.frequency(word, "Phyton");

        System.out.println("frequencyPhyton = " + frequencyPhyton);
        System.out.println("frequencyJava = " + frequencyJava);






    }


}
