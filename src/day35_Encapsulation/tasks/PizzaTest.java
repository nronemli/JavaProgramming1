package day35_Encapsulation.tasks;

public class PizzaTest {
    public static void main(String[] args) {


        Pizza pizza1 = new Pizza("small", 1, 2);

        System.out.println(pizza1);
        System.out.println(pizza1.calcCost());


        Pizza pizza2 = new Pizza("medium", 2, 6);
        System.out.println(pizza2);
        System.out.println(pizza2.calcCost());


    }

}
