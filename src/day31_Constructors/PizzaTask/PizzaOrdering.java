package day31_Constructors.PizzaTask;

import day31_Constructors.PizzaTask.Pizza;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOrdering {
    public static void main(String[] args) {

        //create 100 pizza objects: size- 'S', cheese topping =2 , pepperoni 3
        //same for m and l  == total 300 pizza objects

        ArrayList<Pizza> pizzas = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Pizza smallPizza = new Pizza('S', 2, 3);
            Pizza mediumPizza = new Pizza('M', 3, 4);
            Pizza largePizza = new Pizza('L', 4, 5);

            pizzas.addAll(Arrays.asList(smallPizza, mediumPizza, largePizza));
        }

        System.out.println("Total number of pizza: " + pizzas.size());

        double totalPrice = 0;
        for (Pizza pizza : pizzas) {
            totalPrice += pizza.calcCost();
        }
        System.out.println(totalPrice);

    }
}
