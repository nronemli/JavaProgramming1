package day24_CustomMethodsReturnMethod;

public class Task4 {

    public static boolean isPalindrome(String str){
        return Task3.reverse(str).equalsIgnoreCase(str);
    }

    public static void main(String[] args) {
        String str= "Level";
        System.out.println(isPalindrome(str));
    }




    /*
    4. By using the reverse method above to create another method named isPalindrome  that passes a String parameter, the method returns true if the string is palindrome, otherwise returns false

				Ex:
					str = "Level"

					isPalindrome(str) ===> true

     */
}
