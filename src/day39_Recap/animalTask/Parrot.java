package day39_Recap.animalTask;

public class Parrot extends FriendlyAnimal{

    public Parrot(String name, String breed, char gender, int age, String size, String color,
                  boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }

    @Override
    public void eat() {
        System.out.println(getName() +" loves to eat parrot food");
    }

    public void fly(){
        System.out.println(getName() +" can fly up to 10 m high");
    }

    public void sing(){
        System.out.println(getName() +" loves to sing for hours");
    }


}
