package day37_Inheritance.phoneTask;

public class Nokia extends Phone{
    public Nokia(String model, double size, double price, String color) {
        super("Nokia", model, size, price, color);
    }

    public void selfDefense(){
        System.out.println("self defense");
    }



}
