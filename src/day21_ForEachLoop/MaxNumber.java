package day21_ForEachLoop;

public class MaxNumber {

    public static void main(String[] args) {


        int [] num = {10,5,4,20,1,0};
        int max = num [0];
/*
        for (int i = 0; i < num.length; i++) {

            if(num[i]>max){ //if there is element in the array thats greater than
                //current maximum number
                max = num[i]; //assign greater number to variable max
            }
        }
        
  
 */

        for (int i : num) {
            if(i >max) {
                max = i;
            }
        }

        System.out.println(max);
        
        









    }   
    
    
    
    
    
}
