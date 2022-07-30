package day20_Arrays;

public class MinNumOfArray {
    public static void main(String[] args) {

        int[] num = {10, 4, 5, 40, 1, 30, 90, 100};

        int min = num[0]; //first element 10

        for (int i = 0; i < num.length; i++) { //check each element
            if (num[i] < min) { //if the first element is less thank minumum number check next
                min = num[i]; //assign i to min
            }
        }
        System.out.println(min);
    }
}
