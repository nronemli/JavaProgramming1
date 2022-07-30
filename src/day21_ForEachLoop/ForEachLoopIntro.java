package day21_ForEachLoop;

public class ForEachLoopIntro {

    public static void main(String[] args) {

        int[] num = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        for (int i = 0; i < num.length; i++) { //i: indexes of arrat
            int eachElement = num [i];
            System.out.println(eachElement);
        }
        System.out.println("-----------------------");
        //for each loop
            for(int each :num){ //elements of array
                System.out.println(each);
            }

        System.out.println("--------------------------");







    }





}
