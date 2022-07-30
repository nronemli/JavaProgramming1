package day38_Inheritance;

public class Bmw extends Car {


    //remove brand parameter, add bmw as data
    public Bmw(String model, int year, double price, String color, int miles) {
        super("BMW", model, year, price, color, miles);
    }

    public void breaksDown() {
        System.out.println(brand + " breaks down ");
    }

    public void racing() {
        System.out.println(model + " is great for racing");
    }


}

/*

			2. BMW:
					extra methods:
						breaksDown()
						racing()
 */