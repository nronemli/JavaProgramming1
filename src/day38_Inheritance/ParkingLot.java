package day38_Inheritance;

public class ParkingLot {
    public static void main(String[] args) {

        Toyota toyota1 = new Toyota("Camry", 2020, 20000, "white", 13000);
        Bmw bmw1 = new Bmw("X5", 2021, 27000, "BLACK", 34000);
        Tesla tesla1 = new Tesla("S", 2019, 45000, "Red", 5600);

        toyota1.start();
        bmw1.start();
        tesla1.start();




    }
}
