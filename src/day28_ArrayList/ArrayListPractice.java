package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList <Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println(numbers);
        for (int i = 0; i < numbers.size(); i++) { //i:index numbers of list
            numbers.set(i,numbers.get(i)*2); //get each elements from numbers and times 2
        }
        System.out.println(numbers);
    }
}
