package day36_Inheritance.phoneTask;

public class Iphone extends Phone{


    public void faceTime(long phoneNumber){
        System.out.println(phoneNumber+ " is face timing");
    }

    public void faceTime(String email){
        System.out.println(email+ " is face timing ");
    }


}

/*
1.2 Create a sub class of Phone named IPhone:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					faceTime(long phoneNumber)
					faceTime(String email)
					toString()
 */