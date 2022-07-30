package day23_CustomMethod_Void;

public class Tasks {

    public static void oddNumbers() {

        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
    public static void evenNumbers() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void eligible(int age){

        if(age>21){
            System.out.println("Eligible to buy alcohol");
        }else {
            System.out.println("NOT eligible to buy alcohol");
        }
    }

    public static void nameFormat(String name){

    }

    public static void main(String[] args) {

        oddNumbers();
        System.out.println();
        evenNumbers();
        System.out.println();
        eligible(34);
        System.out.println();

    }

}
