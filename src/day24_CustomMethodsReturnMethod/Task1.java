package day24_CustomMethodsReturnMethod;

public class Task1 {


    public static int frequencyOfWord(String sentence, String word) {

        int count = 0;
        while (sentence.contains(word)) {
            sentence = sentence.replaceFirst(word, "");
            count++;
          //  System.out.println(count);
        }
        return count;

    }

    public static void main(String[] args) {
        System.out.println(frequencyOfWord("My name is nur nur nur nur", "nur"));

    }


}




/*
1.  create a method named frequencyOfWord that passes two parameters: string sentence and String word, then returns the frequency of word from the sentence
                Ex:
                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3

 */