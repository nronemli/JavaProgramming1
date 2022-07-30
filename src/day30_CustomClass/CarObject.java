package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObject {
    public static void main(String[] args) {

        //create an object/instance
        Car car1 = new Car();
        car1.setInfo("Audi", "Q5", "Black", 2017, 26000);
        System.out.println(car1);

        Car car2 = new Car();
        car2.setInfo("Mercedes", "A201", "Blue", 2009, 9000);
        System.out.println(car2);

        Car car3 = new Car();
        car3.setInfo("BMW", "X1", "White", 2006, 1000);
        System.out.println(car3);

        car1.drive();
        car2.stop();
        car3.start();

        //store in array car objects
       // Car[] cars= {car1,car2,car3};

        //store in arraylist for the objects car1,car2,car3
        ArrayList<Car> carList= new ArrayList<>();
        carList.addAll(Arrays.asList(car1,car2,car3));

        for (Car each : carList) {
            System.out.println(each.brand+" "+each.price);
        }

        System.out.println("_____________eligible for recall_________________");

        /*
        Recall:
        BMW:2005-2008
        AUDI- 20018-2021
         */

        //if car is bmw, year is 2005-2008 remove
        carList.removeIf(p-> p.brand.equals("BMW") && p.year >=2005 && p.year <=2008);
        carList.removeIf(p-> p.model.equals("Audi") && p.year>=2017);
        System.out.println(carList);


    }
}
