package day39_Recap.animalTask;

public class Tiger extends WildAnimal{

    public Tiger(String name, String breed, char gender, int age, String size, String color,
                 boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }

    public void hunt() {
        System.out.println(getName()+ "loves to hunt moose, deer species, pigs, cows, horses, " +
                "buffalos and goats");
    }

}
