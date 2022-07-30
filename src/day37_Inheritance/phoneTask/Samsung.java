package day37_Inheritance.phoneTask;

public class Samsung extends Phone{

    public Samsung( String model, double size, double price, String color) {
        super("Samsung", model, size, price, color);
    }

    public void freeze(){
        System.out.println(model+ " always freezes");
    }
}
