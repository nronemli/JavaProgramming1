package day48_Collections;
//needs importing
import java.util.*;

public class ListIntro {


    public static void main(String[] args) {

        //ArrayList, LinkedList, Vector->Stack
        //ARRAYLIST is the most common preferred list

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(10,20,30,40,50,60));
        System.out.println(list1.get(0));

        List<Integer> list2= new LinkedList<>();
        list2.addAll(Arrays.asList(10,20,30,40,50,60));
        System.out.println(list2.get(0));

        List<Integer> list3= new Vector<>();
        list3.addAll(Arrays.asList(10,20,30,40,50,60));
        System.out.println(list3.get(1));

        //stack: last in first out order >LIFO
        //pop for stack only,
        List<Integer> list4 = new Stack<>();
        list4.addAll(Arrays.asList(10,20,30,40,50,60));
        System.out.println(list4.get(0));

        System.out.println("__________________________________");
        ((Stack<Integer>) list4).pop(); //last object will be out from the stack
        System.out.println(list4); //60 removed
        ((Stack) list4).pop();
        ((Stack<Integer>) list4).pop(); //50 removed
        System.out.println(list4);
        ((Stack<Integer>) list4).push(5); //5 added to the end
        System.out.println(list4);

        System.out.println("______________LIST EXAMPLE____________________");
        //list allows duplicates so the list contains 10 elements
        List<Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        System.out.println("list = " + list);
        System.out.println(list.get(4)); //90
    }

    public synchronized void method1(){
    }

}
