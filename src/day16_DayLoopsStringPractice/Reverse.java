package day16_DayLoopsStringPractice;

public class Reverse {

    public static void main(String[] args) {

        String str = "Wooden Spoon";
        //index 01234567....
        String result = ""; //contains the reverse version of the str

        //reverse the word wooden spoon
        //where it starts ; where it ends(index number can be never lower than 0 ;
        for (int i = 11; i >= 0; i--) {
            result += str.charAt(i);
        }
        System.out.println("result " + result);
    }


}
