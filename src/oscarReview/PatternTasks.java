package oscarReview;

public class PatternTasks {

    public static void main(String[] args) {

        for (int row = 1; row <=6 ; row++) { // rows

            for (int col = 1; col <= row; col++) { //colums

                if(col%2==1){
                    System.out.print(1);
                }else {
                    System.out.print(0);
                }
            }
            System.out.println();

        }



    }
}
