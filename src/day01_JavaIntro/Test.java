package day01_JavaIntro;
import utilities.StringUtility;
import day24_CustomMethodsReturnMethod.ReturnMethodIntro;
import day24_CustomMethodsReturnMethod.ReturnMethodPractice4;

public class Test {

    public static void main(String[] args) {

        String str = "aaaaaafffdddfssdsdsds";
        str = ReturnMethodPractice4.removeDuplicates(str);
        System.out.println(str);

        System.out.println("--------------------");
        String name= "Aynur Onemli";

        String reversedName= ReturnMethodIntro.reverse(name);
        System.out.println(reversedName);

        String str1= "Wooden spoon";
        StringUtility.printEachChar(str1);




    }

}
