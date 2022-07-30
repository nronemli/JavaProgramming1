package day7_Operators;

public class SwapTwoVariables_WithTemporaryVariable {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        //-------------------------------
        int c = b; //c=15 contains the original value of b
        //temporary variable to store the value of b

        b = a; //b = 10
        a = c; //a = 15

        //--------------------------------
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }




}
