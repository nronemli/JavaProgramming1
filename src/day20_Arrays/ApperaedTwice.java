package day20_Arrays;

public class ApperaedTwice {
    public static void main(String[] args) {


        char[] chars = {'A','A','B','C','C','C','D','D','D'};


        for (int j = 0; j < chars.length; j++) {
            char ch = chars[j];
            int frequency = 0;

            for (int i = 0; i < chars.length; i++) { //find frequency of chars
                if(chars[i] == ch){
                    frequency++;
                }
            }


            if(frequency==2){
                System.out.println("Appeared twice: " + ch);
            }
        }








    }
}
