package day38_Inheritance;


//parent class has all the common features of all sub-classes
//cannot inherit anything
//constructor: set all the instances

public class Car {


    public String brand,model;
    public int year;
    public double price;
    public String color;
    public int miles;

    //6 parameters passed
    //parent class has constructor: sub-class has to call explicityly super keyword
    public Car(String brand, String model, int year, double price, String color, int miles) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.miles = miles;
    }


    //gets executed automatically when object is
    //all subclasses will inherit it
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", miles=" + miles +
                '}';
    }


    public void start(){
        System.out.println(brand+" is starting");
    }



    public void drive(){
        System.out.println(brand+ " " +model + " is driving");
    }









}

/*
Warmup task:
	carTask:
		Create a class called Car
			instance variables:
				brand, model, year, price, color, miles

				add a constructor to set all the fields

			instance methods:
				start(), drive(),toString()
 */