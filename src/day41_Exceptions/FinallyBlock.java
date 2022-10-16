package day41_Exceptions;

public class FinallyBlock {
    public static void main(String[] args) {

        int[] arr={1,2,3};
        //finally:always gets executed, regardless of exception is being handled or not handled
        //how to stop finally block: terminate before the finally block, system exit
        try{
            System.out.println(arr[10]);
            System.out.println("Try block");
        }catch(RuntimeException e){
            System.out.println("Catch block");
            e.printStackTrace();
            System.exit(0);
        }finally { //use it when the code must be executed, how to stop it system exit in catchup
            System.out.println("Finally block ");
        }

    }
}
