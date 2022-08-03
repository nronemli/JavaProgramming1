package day35_Encapsulation.personTask;

public class Person {

    public String name;
    public int age;
    public char gender;
    public String language;

    public static String planet;
    public static boolean isHuman, hasNose;
    public static int numberOfWings, numberOfHead;

    public Person(String name, int age, char gender, String language) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.language = language;
    }

    //static block: gets executed as soon as the class gets called (gets executed only once)
    static {
        planet= "Earth";
        hasNose= true;
        isHuman= true;
        numberOfHead=1;
        numberOfWings=0;
    }

    //instance methods have direct access to static methods
    //    //instance belongs to object, object came from class.
    //    //to string method : INSTANCE METHOD
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                ", planet name='" + planet + '\'' +
                '}';
    }

    //one copy
    //static only accepts static variables
    public static void printPlanetName(){
        System.out.println("planet name is  "+ planet);
    }

    //different copies are done
    //instance methods also excepts static methods
    public void drink(String food){
        System.out.println(name+ " is drinking" + food);
    }

    public void eat(String food){
        System.out.println(name+ " is eating " +food);
    }



}
