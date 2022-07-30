package day14_Strings;

public class StringMethods1 {
    public static void main(String[] args) {

        //trim(); returns the new string without any white spaces

        String str1= "   aynur    ";
        str1=str1.trim();   //removes the white spaces in the string, update str1 object in the variable
        System.out.println(str1);

        //lastIndexOf(); returns the index number of the char in the string,
        String str2= "Aynur";
        int n1= str2.indexOf("r"); //assign to int since it returns index, looks from the left
        System.out.println(n1); //4

        String st3= "Java programming language";
        int n2= st3.indexOf("amm"); //10
        System.out.println(n2);

        int n3= st3.indexOf("g");
        System.out.println(n3);

        int n4=st3.lastIndexOf("g"); //looks from the right , opposite of indexOf
        System.out.println(n4);

        int firstA= st3.indexOf("a");
        int lastA=st3.lastIndexOf("a");
        System.out.println("lastA = " + lastA);
        System.out.println("firstA = " + firstA);

        System.out.println("n5");
        int n5 = st3.indexOf("la")+1;
        System.out.println(st3);


/*

charAt(index): returns the character at the given index, returns char
					String s = "Python"
					s.charAt(3) ==> 'h'


	length(): returns the total number of characters, returns int

			last index: length() -1


	toLowerCase(): returns new String in the lower case version of old string object

	toUpperCase(): returns new String in the upper case version of old string object

	trim(): returns new String without the white spaces (unused spaces)

	indexOf(str): returns the index number of first occurred character. returns int

	lastIndexOf(str): returns the index number of last occurred character. returns int

	replace(oldValue, newValue): returns new string by repalcing All the old values with the given new value.

	replaceFirst(oldValue, newValue): returns new string by repalcing  the FIRST matchingold values with the given new value.

	substring(beginningIndex , endingIndex): creates substring starting from the given beginning index till the given edning index (ending index is excluded)
 */


        String a= "Java is fun, I love learning Java";
        String b= a.replace("Java","Phyton"); //Phyton is fun,...
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        String c="nuronemli@gmail.com";
        c=c.replace("gmail","yahoo");
        System.out.println(c);

        String d= "This is a test sentence";
        d= d.replace(" is"," IS");
        System.out.println(d);

        String e= "This is a test sentence";
        e=e.replaceFirst("e","a");
        System.out.println(e);

        String f="This is a test sentence";
        f=f.replaceAll("i","I");
        System.out.println(f);

        String word= "Cydeo School";
        //            012345

        String brand=word.substring(0,4);
        System.out.println(brand);

        String wordNew = "Java Programming Language";

        String s1=wordNew.substring(0,wordNew.indexOf(" "));
        String s2=wordNew.substring(wordNew.indexOf(" ")+1,wordNew.lastIndexOf(" "));
        String s3=wordNew.substring(wordNew.lastIndexOf(" ")+1);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);






    }





}
