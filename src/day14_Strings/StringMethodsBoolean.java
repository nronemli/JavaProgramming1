package day14_Strings;

public class StringMethodsBoolean {
    public static void main(String[] args) {


        String str = "";
        boolean a = str.isEmpty(); //if the string is empty no characters
        // if there is white space its not empty it counts white characters
        System.out.println(a); //true

        String str1 = " ";  //space left no characters not empty but blank
        //does not count white space
        boolean b = str1.isBlank(); //true
        System.out.println(b);

        String str2 = "Cydeo    ";

        System.out.println(str2.isEmpty());
        System.out.println(str.isBlank());

        System.out.println("--------------------------");
        String s1 = "CYDEO";
        String s2 = "cydeo";

        //check character by character cannot ignore case sensitivity
        System.out.println(s1.equals(s2)); //false
        System.out.println(s1.equalsIgnoreCase(s2));//true: ignores case lower or upper

        System.out.println("----------------------------");

        //check if the string contains particular word
        String sentence = "My favourite programming language is Java";

        boolean hasJava = sentence.contains("Java"); //true
        System.out.println(hasJava);

        boolean hasMy = sentence.toLowerCase().contains("my"); //
        System.out.println(hasMy); //true

        System.out.println("-----------------------------");

        String str4 = "Wooden Spoon"; //if string starts with specific characters
        // case sensitivty
        boolean x = str4.startsWith("Woo");
        System.out.println(x);
        boolean y = str4.endsWith("oon");
        System.out.println(y);

        boolean z = str4.toLowerCase().startsWith("woo");
        //first create lower or upper version of the string
        System.out.println(z);

    }
}
