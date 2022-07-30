package day38_Inheritance;

//toyota is child class, inherits all car class
public class Toyota extends Car {

    //child class calls the constructor the parent class constructor
    //only a constructor can call another constructor
    //remove brand parameter since all brand is toyota, and change the data to toyota

    public Toyota(String model, int year, double price, String color, int miles) {
        super("Toyota", model, year, price, color, miles);
    }

//subclass can have own methods and variables
    public void reliable(){
        System.out.println(brand+ " is reliable "+model);
    }
}

/*
    Create the following sub classes of Car:
        1. Toyota:
        extra methods:
        reliabile()
 */