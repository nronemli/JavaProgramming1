package day43_Abstraction.Car;

public class CarShop {
    public static void main(String[] args) {

        Honda honda = new Honda("Accord", " Black", 2019, 30000);
        Audi audi = new Audi("Q7", "Black", 2008, 4000);
        Tesla tesla = new Tesla("Model 3", " White", 2021, 6000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);
        honda.setColor("Red");
        audi.setColor("Pink");
        tesla.setColor("Green");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        honda.setPrice(250000);
        audi.setPrice(54000);
        tesla.setPrice(34000);

        //abstract class can not have objects
        //it can have abstract methods


    }
}
