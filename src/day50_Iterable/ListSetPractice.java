package day50_Iterable;

import java.util.*;

public class ListSetPractice {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5));
        System.out.println(set);
        List<Integer> list = new ArrayList<>(set);
        System.out.println(list);

        List<String> names = null;
        //System.out.println(names.size()); //null pointer exception
        System.out.println("+++++++++++++POP++++++++++++++++++");
        //pop() ===> LIFO
        List<Character> chars = new Stack<>();
        chars.addAll(Arrays.asList('A', 'B', 'C', 'D'));
        ((Stack) chars).pop();
        System.out.println("chars = " + chars);
        System.out.println("+++++++++++++POLL++++++++++++++++++");
        //poll() ===> FIFO
        //PRIORITY QUEUE ,LINKED LIST,OR ARRAY DEQUE can be called
        List<String> names1= new LinkedList<>();
        names1.addAll(Arrays.asList("James","Jimmy","Kathy","Breanna","Max"));

        System.out.println(names);
        ((LinkedList) names1).poll();
        //1st element will be removed after poll
        System.out.println("names1 = " + names1);
        //1st element will be removed after poll
        ((LinkedList) names1).poll();
        System.out.println("names1 = " + names1);

    }
}
