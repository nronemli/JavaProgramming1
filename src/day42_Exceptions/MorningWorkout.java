package day42_Exceptions;

public class MorningWorkout {
    public static void main(String[] args) {

        System.out.println("------------Push up started------------");
        //checked exception
        for (int i = 1; i <= 30; i++) {
            System.out.print("\r \t\t\tPush up " + i);
            sleep(1);
        }
        System.out.println("\n-----------Push up completed--------");

        System.out.println("-------------Pull up started----------");
        for (int i = 1; i < 20; i++) {
            System.out.print("\r \t\t\tPull up " + i);
            sleep(1);
        }
        System.out.println("\n-----------Pull up completed--------");
    }

    //SLEEP METHOD -- NEED IN SELENIUM
    public static void sleep(double seconds) {
        try {
            Thread.sleep((long)(seconds*1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
//Do 30 pushups and try pausing 1.5 seconds in each