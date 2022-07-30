package day36_Inheritance.phoneTask;

public class Phone {

    public String brand, model;
    public double size, price;
    public String color;

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    public void setInfo(String brand, String model, double size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public void call(long phoneNumber) {
        System.out.println(phoneNumber + "is calling");
    }

    public void text(long phoneNumber) {
        System.out.println(phoneNumber + " is texting ");
    }
}

/*
1. Phone Task:
		1.1 Create a class named Phone:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					toString()





 */