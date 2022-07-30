package day09_IfElseStatements;

public class MedianNumber {
    public static void main(String[] args) {
        int a = 10, b = 15, c = 20; //you can create it side by side or underneath each other

        //a = 15 , b =10, c =20   //a=15, b =20, c =10
        boolean medianA = (a > b && a < c) || (a > c && a < b);
        //a= 10 , b=15, c=20      /a=20, b=15, c=10
        boolean medianB = (b > a && b < c) || (b < a && b > c);
        //c=15, b =10, a =20   //c=15, a =10, b=20

        //not median a or not median b
        boolean medianC = !medianA && !medianB;

        if (medianA) { //if a is median number
            System.out.println(a + " is the median number");
        }

        if (medianB) {  //if b is the median number
            System.out.println(b + " is the median number");
        }
        if (medianC) {   //if c is the median number
            System.out.println(c + " is the median number");

        }
/*
Ex:
				a = 10, b= 15, c = 20;
			Output:
				15 is the median number

			Posibility #1: a could be median number
			Posibility #2: b could be median number
			Posibility #3: c could be median number
 */

    }


}
