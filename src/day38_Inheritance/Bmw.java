package day38_Inheritance;

public class Bmw extends Car{



    public Bmw(String model, int year, double price, String color, int miles) {
        super("BMW", model, year, price, color, miles);
    }

    public void breaksDown(){
        System.out.println(brand+ " breaks down ");
    }




}

/*

			2. BMW:
					extra methods:
						breaksDown()
						racing()
 */