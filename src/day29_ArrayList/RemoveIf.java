package day29_ArrayList;

import utilities.StringUtility;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIf {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        System.out.println(list);

        list.removeIf(p -> p < 5); //lambda expression
        System.out.println("********remove all elements less than 5 : REMOVEIF METHOD");
        System.out.println(list);
        System.out.println("*********remove even numbers************************");

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        list2.removeIf(each -> each % 2 == 0); //even
        System.out.println(list2);

        System.out.println("*********remove if starts with j ****************");

        ArrayList<String> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList("Java", "Phyton", "Javascript", "C++", "Java"));

        list3.removeIf(p -> p.startsWith("J")); //if each element starts with j remove it from the array list
        System.out.println(list3); //Phyton , c++

        System.out.println("*********************palindrome*******************");
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Anna", "Racecar", "Level", "Eye", "Java", "Phyton"));
        names.removeIf(each -> StringUtility.isPalindrome(each));
        System.out.println(names); //java, phyton

        names.addAll(Arrays.asList("Anna", "Racecar", "Level", "Eye", "Java", "Phyton"));
        names.removeIf(each -> !StringUtility.isPalindrome(each)); //not palindrome
        System.out.println(names); // print all thats not palindrome


    }
}
