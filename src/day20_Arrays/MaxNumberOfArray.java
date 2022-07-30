package day20_Arrays;

public class MaxNumberOfArray {

    public static void main(String[] args) {


        int [] num = {10,5,4,20,1,0};


        int max = num [0];

        for (int i = 0; i < num.length; i++) {

            if(num[i]>max){ //if there is element in the array thats greater than
                //current maximum number
                max = num[i]; //assign greater number to variable max
            }
        }
        System.out.println(max);




    }




}
