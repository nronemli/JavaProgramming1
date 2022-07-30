import java.util.Arrays;

public class Car {

    public String make, model;
    public int year;
    public double price;
    public String color;

    //1st constructor: initializes the make ONLY
    public Car(String make) {
        this.make = make;
    }

    //2nd constructor: initializes make & model (MUST use constructor call to set the make)
    public Car(String make, String model) {
        this(make);
        this.model = model;
    }

   // 3rd constructor: initializes make, model, year
    // (MUST use constructor call to set the make, model)
    public Car(String make, String model, int year) {
       this(make, model);
        this.year = year;
    }

    //4th constructor: initializes make, model, year, price
    //(MUST use constructor call to set the make, model, year)
    public Car(String make, String model, int year, double price) {
        this(make, model, year);
        this.price = price;
    }

   // 5th Constructor: intializes all the instances
    // (MUST use constructor call to set the make, mode, year, price, color)
    public Car(String make, String model, int year, double price, String color) {
        this(make, model, year, price);
        this.color = color;
    }

    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
class CarObjects {

    public static void main(String[] args) {

        Car car1= new Car("Audi");
        Car car2= new Car("Audi","Q5");
        Car car3= new Car("Audi","Q5", 2018);
        Car car4= new Car("Audi","Q5",2018,28000,"Black");

        Car [] cars = {car1,car2,car3,car4};
        System.out.println(Arrays.toString(cars));
    }
}
