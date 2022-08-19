package day43_Abstraction.Car;

import day43_Abstraction.Car.Car;

// to prevent from being inherited: final
public final class Tesla extends Car {
    public Tesla( String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Say start to start the car");
    }

    public void autoPilot(){
        System.out.println(getBrand() + " "+getModel() + " has auto pilot feature");
    }


}
