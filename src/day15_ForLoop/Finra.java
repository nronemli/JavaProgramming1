package day15_ForLoop;

public class Finra {
    public static void main(String[] args) {

        for(int i =1; i <=100;i++) { //i, 1,2,3,4,5,6...10
            if (i % 15 == 0) {
                System.out.print("FINRA "); //15,30,45...
            } else if(i %3==0){
            System.out.print("FIN "); //3,6,9,12
             }else if(i%3==0){
                System.out.print("RA ");//5,10,15,20
            }else {
                System.out.print(i+" ");
            }
        }


















    }
}
