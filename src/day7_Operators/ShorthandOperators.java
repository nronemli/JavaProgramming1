package day7_Operators;

public class ShorthandOperators {
    public static void main(String[] args) {

        //assignment =
        int number = 100;

        System.out.println("Number= " + number);
        //same variable changed value
        number = 200;

        System.out.println("Number= " + number);
        //prints java as word //data type set
        String word = "Java";
        System.out.println("word = " + word);
        //assign new value to it
        word = "Wooden spoon";
        System.out.println("New word = " + word);
        word = "Nur";
        System.out.println("Newest word= " +word);

        int x= 250;
        System.out.println("x = " + x);
        System.out.println(x+200); //450

        //joined
        String str="Wooden ";
        str+= "Spoon";

        System.out.println("str = " +str);

        double num1 = 2.5;

        System.out.println("num1= " +num1); //2.5

        num1 +=5.5;
        System.out.println("num1 = " + num1); //8.0

        double avaliableBalance= 100.50;
        avaliableBalance += 300;

        System.out.println("avaliableBalance = " + avaliableBalance); //400.5



       // System.out.println("x = " + x );




    }


}
