package day35_Encapsulation.encapsulation;

public class PersonObject {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.setName("Nur");
        p1.setAge(-2000);

        System.out.println(p1.getAge());
        System.out.println(p1.getName());


    }
}
