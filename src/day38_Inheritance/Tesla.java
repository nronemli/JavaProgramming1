package day38_Inheritance;

public class Tesla extends Car {

    public Tesla(String model, int year, double price, String color, int miles) {
        super("Tesla", model, year, price, color, miles);
    }

    public void autoPilot() {
        System.out.println(brand + " " + model + " can autopilot");
    }

    //return type, access modifier and variable name has to be same as the parent class
    @Override
    public void start() {
        System.out.println("Say start to start " + model + "  " + brand);
    }
}



/*
	3. Tesla:
					extra methods:
						autoPilot();
 */