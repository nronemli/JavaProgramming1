package day35_Encapsulation.tasks;

public class Pizza {
    private String size;
    private int numberOfCheeseTopping, numberOfPepperoniTopping;

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }

    public String getSize() {
        return size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setSize(String size) {
        if (!(size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium") || size.equalsIgnoreCase("large"))) {
            System.err.println("Pizza size can be only small, medium or large");
            System.exit(0);
        }
        this.size = size;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        if (numberOfCheeseTopping < 0) {
            System.err.println("Invalid no" + numberOfCheeseTopping);
            System.exit(0);
        }

        boolean sizeChoice = size.equalsIgnoreCase("small") && numberOfCheeseTopping <= 3 ||
                size.equalsIgnoreCase("medium") && numberOfCheeseTopping <= 4 ||
                size.equalsIgnoreCase("large") && numberOfCheeseTopping <= 5;

        if (sizeChoice) {
            switch (size) {
                case "small":
                case "medium":
                case "large":
                    this.numberOfCheeseTopping = numberOfCheeseTopping;
            }
        } else {
            System.err.println("Invalid no of cheese topping");
            System.exit(0);
        }
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        boolean sizeChoice = size.equalsIgnoreCase("small") && numberOfPepperoniTopping <= 3 ||
                size.equalsIgnoreCase("medium") && numberOfPepperoniTopping <= 4 ||
                size.equalsIgnoreCase("large") && numberOfPepperoniTopping <= 5;

        if (sizeChoice) {
            switch (size) {
                case "small":
                case "medium":
                case "large":
                    this.numberOfPepperoniTopping = numberOfPepperoniTopping;
            }
        }else{
            System.err.println("Invalid no of pepperoni topping");
            System.exit(0);
        }
        }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ",total cost=" + calcCost() +
                '}';
    }

    public double calcCost() {
        double baseCost = (size.equalsIgnoreCase("small")) ? 10
                : (size.equalsIgnoreCase("medium")) ? 12 : 14;
        double totalPrice = (numberOfCheeseTopping + numberOfPepperoniTopping) * 2 + baseCost;
        return totalPrice;
    }
}






/*
5. Pizza Task:
		5.1 Create class named Pizza:
				private variables:
					size, numberOfCheeseTopping, numberOfPepperoniTopping

				Encapsulate all the fields
						Conditions:
							size of the pizza can only be small, medium, large. case insensitive

							Number of cheese topping can not be negative, the maximum number of cheese topping is:
										small: 3
										medium: 4
										large: 5

							Number of pepperoni topping can not be negative, the maximum number of pepperoni topping is:

										small: 4
										medium: 5
										large: 6

				Add a constructor that allows user to set all the fields when the object is created.
								(If the arguments not valid it should not be set to the instances)


				Methods:
					calcCost(): returns the totalCost of the pizza
					toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()


		Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping

 */