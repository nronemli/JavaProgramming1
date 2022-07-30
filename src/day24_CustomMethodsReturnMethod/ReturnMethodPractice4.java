package day24_CustomMethodsReturnMethod;

public class ReturnMethodPractice4 {

    //create a method that can remove duplicated characters from a string and returns the new value

    public static String removeDuplicates(String str){ //"aabbcc ==> abc

        String result="";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i); //each character from the string
            if(!result.contains(""+each)){ //if the result does not contain character in the string
                result+= each; //at each char to result
            }
        }
        return result;
    }


    public static void main(String[] args) {

        String str= "aaddddgrgggggggssssssddd";
        str = removeDuplicates(str);
        System.out.println(str);

    }
}
