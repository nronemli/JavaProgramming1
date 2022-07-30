package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {

        /*
        Arrays Utility class:

		toString(array): converts the array object (single dimensional) to string, returns string
		sort(array): sorts the array in ascending order

					ascending order: smallest to largest

		equals(array1, array2): checks if two arrays are equal, returns boolean :EVERY INDEX HAS TO HAVE SAME ELEMENT

		copyOf(array, newLength): copys the elements of the array, starting from first element to given number, returns new array
		copyOfRange(array, beginningIndex, endingIndex): copys the elements of the array, staring from beginning index till the ending index (ending index excluded), returns new array


         */
        int[] scores = {95, 100, 55, 65, 85, 78};
        System.out.println(Arrays.toString(scores));
        System.out.println(scores[4]); //prints the score in the 5th element since index starts from 0,1,2,3,4
        System.out.println("----------------------------");

        Arrays.sort(scores); //sorts in ascending order
        System.out.println(Arrays.toString(scores));
        System.out.println("----------------------------");

        System.out.println("Min score: " + scores[0]); //once sorted the first is min
        System.out.println("Max score: " + scores[scores.length - 1]); //last one will be max after sorted

        System.out.println("----------------------------");

        String[] names = {"A", "B", "D", "H", "E", "S", "K"};

        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        System.out.println("----------------------------");

        int[] arr1 = {1, 3, 2};
        int[] arr2 = {1, 2, 3};

        boolean r1 = Arrays.equals(arr1, arr2); //compare two arrays
        System.out.println(r1); //false

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean r2 = Arrays.equals(arr1, arr2); //compare two arrays
        System.out.println(r2); //true

        System.out.println("----------------------------");

        //check two string if they are built out from same characters : ANAGRAM
        char[] ch1 = {'a', 'c', 'd'};
        char[] ch2 = {'a', 'd', 'c'};

        Arrays.sort(ch1); //a c d
        Arrays.sort(ch2); //a c d

        boolean anagram = Arrays.equals(ch1, ch2);
        System.out.println(anagram); //true

        System.out.println("----------------------------");

        String[] students = {"Elif", "Sinem", "Gunay", "Cihad", "Nur", "Nese"};
        String[] earlyBirds = Arrays.copyOf(students, 3); //first three elements of students are copied into
        //early birds array , starts from the first element ONLY!
        System.out.println(Arrays.toString(earlyBirds));

        System.out.println("----------------------------");

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        numbers = Arrays.copyOf(numbers, 5); //1,2,3,4,5
        //element number
        System.out.println(Arrays.toString(numbers));
        System.out.println("----------------------------");
        //copyOfRange(array, beginningIndex, endingIndex):

        char[] ch3 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
        char[] ch4 = Arrays.copyOfRange(ch3, 2, 6 + 1); //copies elements from specific starting point to ending
        //index numbers, last index is excluded!
        System.out.println(Arrays.toString(ch4));

        System.out.println("----------------------------");
        int[] num = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};  //copy in result from 40-80
        int[] result = Arrays.copyOfRange(num, 3, 8); //ending index is excluded
        System.out.println(Arrays.toString(result));


    }
}
