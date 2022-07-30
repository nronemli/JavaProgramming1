package day21_ForEachLoop;

public class ForEachLoopPractice {
    public static void main(String[] args) {

        String [] words= {"Java Programming", "Cydeo School", "Wooden Spoon"};

        for (String eachWord : words) {
            System.out.println(eachWord.charAt(0) +""+ eachWord.charAt(eachWord.length()-1)); //first and last charcters of each words
            //will be printed
        }











    }
}
