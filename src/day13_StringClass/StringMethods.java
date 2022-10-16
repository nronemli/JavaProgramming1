package day13_StringClass;

public class StringMethods {

    public static void main(String[] args) {

        String word = "Cydeo";
                //index no 01234
        char third= word.charAt(2);
        //request the 3 rd letter index starts from 0 , 1, 2,

        System.out.println("Third letter is : " +third);

        System.out.println("----------------------------------");
        String s1= "Aynur Onemli";
        //length returns the total character of the string
        int totalCharacter = s1.length();
        System.out.println("totalCharacter = " + totalCharacter);

        // return the last character of the string
        char lastChar = s1.charAt(s1.length() -1);
        //char lastChar = s1.charAt(totalCharacter - 1);
        //char lastChar = s1.charAt(11); // THIS IS ALSO A WAY OF DOING IT
        System.out.println("lastChar = " + lastChar);

        System.out.println("--------------------------------------" );

        String result = "wooden spoon"; // lower case
        result = result.toUpperCase(); //asign it back to result for the updated version
        System.out.println(result); // prints the updated version in uppercase








    }




}
