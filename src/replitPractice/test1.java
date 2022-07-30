package replitPractice;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {


        boolean one = ('a' != 'z') && false;
        boolean two = one || 0 == (9 - 10 + 1);
        System.out.println(two);

        System.out.println("----------------------");

        long l = 100;
        short s = (short) l;
        System.out.println(s + 10);
        System.out.println("----------------");

        int a = 10;
        a = --a + a++ + --a + a++;
        System.out.println(a);

        System.out.println("------------");

        short ss = 13 + 3 * (10 - 6) % 2;
        boolean b = ss != 25;
        System.out.println(b);

        System.out.println("------------------------");
        byte g = 104;
        boolean check = g < 100;

        if (check) {
            g -= 100;
        } else {
            g = 50;
        }
        System.out.println(g);
        System.out.println("++++++++++++++++++++++");

        if (183 == 13 + 50 * 2 + 70) {
            System.out.println("Java");
        } else {
            System.out.println("Soft skills");
        }

        System.out.println("==========================");


        double pi = 3.14;
        boolean x = 119 % 5 == 0;
        int num = 0;

        if (pi > 3.14 && !x) {
            num += 50;
        } else {
            num -= 50;
        }
        if (x) {
            num += 50;
        }
        System.out.println(num);

        System.out.println("+++++++++++++");
        double decimal = 13.142;

        int whole = decimal < 20 ? 20 : 10;
        System.out.println(whole);
        System.out.println("+++++++++++++");


    }
}






