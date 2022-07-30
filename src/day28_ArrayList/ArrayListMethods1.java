package day28_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListMethods1 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(); //arraylist object is created

        //adding element to the array list add()
        numbers.add(4); //index 0
        numbers.add(4); //index 1
        numbers.add(10); //index 2
        numbers.add(10);
        numbers.add(1);
        numbers.add(5);
        System.out.println(numbers); //4,4,10

        numbers.add(1, 6); //the number in index 1 is inserted there and the rest is shifted
        System.out.println(numbers); //4,6,4,10
        System.out.println("*********************************");
        //size()returns the total number of elements
        System.out.println(numbers.size());
        int lastIndex = numbers.size() - 1; //last index number
        System.out.println("lastIndex = " + lastIndex); //3
        System.out.println("*********************************");

        //get(index) = returns the element at the given index
        Integer num = numbers.get(3); //returns integer
        System.out.println(num); //10
        System.out.println("*********************************");

        //get each elements from the array
        //size of numbers
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i)); //4,6,4,10
        }
        System.out.println("*********************************");

        ArrayList<String> list = new ArrayList<>();
        list.add("java");
        list.add("phyton");
        list.add("c++");
        list.add("sql");
        list.add("java");
        System.out.println(list);  //list all items in the array list
        list.set(4, "Java Script"); //replace the element at given index with the new element
        System.out.println(list);
        System.out.println("*********************************");

        ArrayList<String> employees = new ArrayList<>();

        employees.add("Emin");
        employees.add("Selim");
        employees.add("Necip");
        employees.add("Aynur");
        employees.add("Nur");

        System.out.println(employees);  //emin selim necip aynur nur
        employees.remove(0);     //removes the element in index 0
        System.out.println(employees); //selim necip aynur nur
        employees.remove(0);     //removes the element in index 0
        System.out.println(employees); //necip aynur nur
        employees.remove(0);     //removes the element in index 0
        System.out.println(employees); //aynur nur
        //array size decreased by remove method

        employees.remove(employees.size() - 1); //remove the last element
        System.out.println(employees); //aynur
        boolean r1 = employees.remove("Aynur");
        System.out.println(employees); //empty
        System.out.println("*********************************");

        //clear method removes all elements from the array , sets size to 0
        System.out.println(list); //java, Phyton, c++, sqp, java script
        list.clear();       //clears the list
        System.out.println(list.size());    //size of list 0
        System.out.println(list);           //list empty

        System.out.println("*********************************");

        //indexOf() : returns th first matching elements index number, returns int
        //lastIndexOf(): returns the last matching elements index number, returns int

        ArrayList<Character> chars = new ArrayList<>();
        chars.add('A');
        chars.add('A');
        chars.add('A');
        chars.add('A');
        chars.add('A');

        int a = chars.indexOf('A'); //0
        int b = chars.lastIndexOf('A'); //4
        System.out.println(a);
        System.out.println(b);
        System.out.println("*********************************");

        boolean r2 = chars.contains('A');
        boolean r3 = chars.contains('Z');

        System.out.println(r3); //false
        System.out.println(r2); //true
        System.out.println("*********************************");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(200);
        list1.add(300);
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(100);
        list1.add(200);
        list1.add(300);

        System.out.println(list1 == list2); //false: two different objects are created in the heap for list1 and list2,
        //when compared they will not be same
        System.out.println(list1.equals(list2));

        System.out.println("*********************************");

        boolean isEmpty = list1.isEmpty(); //false
        System.out.println(isEmpty);
        list1.clear();
        boolean isEmpty2 = list1.isEmpty();
        System.out.println(isEmpty2); //true
        System.out.println("*********************************");

        //containAll();






    }

}
