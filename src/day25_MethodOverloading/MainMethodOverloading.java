package day25_MethodOverloading;

public class MainMethodOverloading {

    //string array gets executed, main can be overloaded but string gets executed
    public static void main(String[] args) {
        System.out.println("String");
    }
    public static void main(int[] args) {
        System.out.println("int");
    }

    public static void main(double[] args) {
        System.out.println("double");
    }

    public static void main(char[] args) {
        System.out.println("char");
    }

}
