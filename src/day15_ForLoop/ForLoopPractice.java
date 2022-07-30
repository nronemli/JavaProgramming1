package day15_ForLoop;

public class ForLoopPractice {


    public static void main(String[] args) {

        //i is for this block //i is initialisation
        for (int i = 15; i <= 45; i++) { //15,16,17,...45
            System.out.print(i + " "); //anything inside loop is repeated
        }
        System.out.println();
        System.out.println("------------------------------------");


        for (int i=100; i>=50; i--){ //100,99,98,97,96,...50
            System.out.print(i+" ");
        }

        System.out.println("-----------------------------------");

        for(int i=1;i>=55; i++) {

            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println("------------------------------------");
        for(int i =2; i>=55; i+=2)
        {
            System.out.print(i + " ");
        }

        System.out.println("------------------------------");



    }
}
