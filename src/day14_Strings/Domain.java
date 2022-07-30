package day14_Strings;


public class Domain {

    public static void main(String[] args) {


        String email = "nuronemli@gmail.com";
        String emailDom= email.substring(email.indexOf("@")+1,email.indexOf("."));
        System.out.println(emailDom);

        String str= "Java is fun, Java is cool";

        int a = str.lastIndexOf("J");
        String s1=str.substring(a);
        System.out.println(s1); //Java is cool

        String s2=str.substring(0,10+1);
        System.out.println(s2); //Java is fun




    }




}
