package day06_PrimitiveDayCasting;

public class PrimitiveCastings {
    public static void main(String[] args) {

        //double > float > long > int > short > byte
        //can assign a smaller primitive to larger
        byte a = 100;
        short b = a;
        //short b = (short)a
        int c = b; // implicit casting
        //int c = (int)b
        long d = c;
        float e = d;
        double f = e;

        System.out.println("___________________________________" );

        //larger primitive types cannot be directly assigned to smaller primitive types
        //explicit casting
        int x = 55;
        short y = (short) x;

        System.out.println(x + " : " + y);

        long j = 1000000;
        short k = (short) j;

        System.out.println("k = " + k);
        System.out.println("j = " + j);

        double l = 2.5;
        float m = (float) l;

        System.out.println(l + " : " + m);

        double n = 10.8;
        int s = (int) n;

        System.out.println(n + " : " + s);

        double d1 = 20.5;
        short s1 = (short) d1;

        System.out.println(d1 + " : " + s1);


    }


}
