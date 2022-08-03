package day39_Recap.animalTask;

public class Dolphin extends FriendlyAnimal{

    public Dolphin(String name, String breed, char gender, int age, String size, String color,
                   boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }

    public void swim(){
        System.out.println(getName() + " swims so deep in the ocean");
    }

    @Override
    public void eat() {
        System.out.println(getName() +" loves to eat fish in the ocean");
    }
}
