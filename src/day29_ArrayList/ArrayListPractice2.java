package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {


        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Ali", "David", "Ahmed", "Jimmy", "Aaron", "Ahmed", "David"));

        employees.retainAll(Arrays.asList("Ahmed", "David")); //remove everything except ahmet and david

        System.out.println(employees);
        System.out.println("++++++++++++++++++++++++++++++");

        String[] names = {"Mary", "Monica", "Mehray", "Sumeyra", "Hasan", "Nur"};

        //convert to array list
        ArrayList<String> list = new ArrayList<>(Arrays.asList(names));

        //remove if the character at 0 equals to upper case M
        list.removeIf(p -> p.charAt(0) == 'M');
        System.out.println(list); //sumeyra, hasan, nur

        names = list.toArray(new String[0]);
        System.out.println(Arrays.toString(names));



    }


}
