package day39_Recap.animalTask;

public class WildAnimal extends Animal{
    private boolean isWild;
    private boolean isFriendly;
    private boolean isPlayable;

    public boolean isWild() {
        return isWild;
    }

    public boolean isFriendly() {
        return isFriendly;
    }

    public boolean isPlayable() {
        return isPlayable;
    }

    public void setWild(boolean wild) {
        isWild = wild;
    }

    public void setFriendly(boolean friendly) {
        isFriendly = friendly;
    }

    public void setPlayable(boolean playable) {
        isPlayable = playable;
    }

    public void hunt(){
        System.out.println(getName()+ " "+ getBreed() + " loves to hunt");
    }

    public WildAnimal(String name, String breed, char gender, int age, String size, String color,
                      boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color);
        setWild(isWild);
        setPlayable(isPlayable);
        setFriendly(isFriendly);
    }

}



/*
3. Create a sub class of Animal named WildAnimal:
				Variable:
						isWild, isFriendly, isPlayable

				Extra Methods:
					hunt()


5. Create the following sub classes of WildAnimal and Override the hunt method,
	and add any extra methods that are needed:
				1. Lion
				2. Tiger
				3. Eagle
				4. Bear
				5. Python
				6. Crocodile




 */
