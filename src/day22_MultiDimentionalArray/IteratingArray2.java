package day22_MultiDimentionalArray;

public class IteratingArray2 {
    public static void main(String[] args) {

        int arr2[][] = {{1, 2, 3}, {4, 5, 6, 7, 8}, {9, 10, 11, 12, 13}};

        for (int i = arr2.length - 1; i >= 0; i--) {//i: index number of 1d array starting from lst index to 0

            for (int each = 0; each < arr2[i].length; each++) { //each element in the array
                System.out.print(arr2[i][each] + " ");

            }
            System.out.println();
        }

        System.out.println("-----------------------------------");

        for (int i = 0; i < arr2.length; i++) {

            for (int i1 = arr2[i].length - 1; i1 >= 0; i1--) {
                System.out.print(arr2[i][i1] + " ");
            }
            System.out.println();

        }


    }
}
