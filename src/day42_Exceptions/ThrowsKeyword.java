package day42_Exceptions;

                                        //add throws keyword to method signature
                                        //advantage: less block of code
public class ThrowsKeyword {            //disadvantage: only for checked,
    public static void main(String[] args) throws InterruptedException{
        System.out.println("__________Test 1 _____________");
        System.out.println("Hello");
        Thread.sleep(3000);
        System.out.println("Cydeo");
        System.out.println("--------Test 1 Completed---------");
        System.out.println("__________Test 2 _____________");
        System.out.println("Hello");
        Thread.sleep(3000);
        System.out.println("Batch 9");
        System.out.println("--------Test 2 Completed--------");
    }
}
/*
Unchecked exceptions: ONE WAY TO HANDLE
Checked exceptions:TWO WAYS TO HANDLE

THROWS keyword:TEMPORARY SOLUTION!
ADVANTAGE LESS BLOCK OF CODES, add to method signature(change), methods body no additional code fragments
Disadvantage: Who ever calls that method that contains that throws the keyword is responsible for handling exception
if you are going to call the method(parent) the child will still have the errors

Try catch  :FIXES PROBLEM :
Disadvantage: Lots of block of codes everytime it occurs
ADVANTAGE: PERMANENT SOLUTION
--------------------------
 */





