package day36_Inheritance.phoneTask;

public class PhoneObject {
    public static void main(String[] args) {

        Iphone i1= new Iphone();
        i1.setInfo("Iphone","imax", 9,1100,"blue");
        i1.faceTime("nuronemli@gmail.com");
        i1.text(07504444556);

        Samsung s1= new Samsung();
        s1.setInfo("Samsung","s1",9,1250,"black");
        s1.freeze();
        s1.call(23_456_787);

        Nokia n1= new Nokia();
        n1.setInfo("Nokia","n1",10,1100,"");

    }
}


//1.5 Create a class named Phone Objects
// and test of the sub class' objects