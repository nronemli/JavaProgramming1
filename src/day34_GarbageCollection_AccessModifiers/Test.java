package day34_GarbageCollection_AccessModifiers;

public class Test {
    public static void main(String[] args) {

        int num = 5;
        while (isAvaliable(num)) {

            System.out.println(num);
        }

    }
public static boolean isAvaliable(int num){
        return (num-- >0)? true : false;
    }


}
