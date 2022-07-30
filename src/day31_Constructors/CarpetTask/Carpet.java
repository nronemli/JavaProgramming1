package day31_Constructors.CarpetTask;

public class Carpet {

    //public modifier can be accessed from everywhere from this project: accessible 
    public double width, length, unitPrice;
    public boolean isPersian;

    //constructor will be created default constructor if you dont create one

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcCost() {
        double total = (width * length) * unitPrice;
        if (isPersian) {
            total += 200;
        }
        return total;

    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice= " + unitPrice +
                ", isPersian=" + isPersian +
                ", total " + calcCost() +
                '}';
    }
}

/*
5. Carpet Task:
	5.1create a custom class for the Carpet class that should contain the following:
                instance variables:
                        width, length, unitPrice, isPersian (boolean)

		Add a constructor to set all the instances

                instance methods:

                        calcCost(): should be able to calculate the total cost of the carpet and return it as double
                        toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()

            total price of carpet = (width*length)*unitprice

            if the carpet is persian  carpet, add 200$ to the totalPrice

 */