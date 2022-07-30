package day09_IfElseStatements;

public class minNumber {
    public static void main(String[] args) {

        int n1 = 300;
        int n2 = 200;
        boolean n1IsMin = n1 < n2;
        boolean n2IsMin = n2 < n1;
        boolean equal = n1 == n2;

        if (n1IsMin) { //if n1 is the minumum number
            System.out.println(n1 + " is the minimum number");
        }

        if (n2IsMin) { //if n2 is the minumum number
            System.out.println(n2 + " is the minumum number");
        }

        if (equal) {
            System.out.println("equal");
        }

  /*
n1= 100, n2 = 200;

			output:
				100 is the minimum number


			n1 & n2

			possibility #1: n1 is Min
			possibility #2: n2 is Min
			possibility #3: equal
 */


    }


}
