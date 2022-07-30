package day7_Operators;

public class Casting {
    public static void main(String[] args) {
        //casting required if assigning a larger type to  smaller type

        float averageScore = 20.5f;

        byte num1 = (byte) averageScore; //explicit casting
        short num2 = (short) averageScore; //explicit casting
        int num3 = (int) averageScore; //explicit casting
        long num4 = (long) averageScore; //no casting because long is bigger than float
        float num5 = averageScore; //implicit casting //because it same as above
        double num6 = averageScore; //double is smaller than float

        System.out.println("num1 =" + num1);
        System.out.println("num2 =      " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);

    }


}
