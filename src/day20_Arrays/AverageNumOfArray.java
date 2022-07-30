package day20_Arrays;

public class AverageNumOfArray {
    public static void main(String[] args) {

        int[] num = {10, 20, 30, 40, 50, 60};

        double sum = 0;

        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        double average = sum / num.length;
        System.out.println("Average number:" + average);

        System.out.println("\nFOR EACH LOOP ANSWER BELOW");

        for (int i : num) {
            sum+= i;
        }
        double average1 = sum / num.length;
        System.out.println("Average number:" + average1);





    }
}
