package day18_NestedLoop;

public class DivideTwoNumbers {

    public static void main(String[] args) {

        int count = 0;
        int a = 20;
        int b = 6;

        while (a >= b) {
            a -= b;
            count++;
        }
        System.out.println(count);
    }
}
