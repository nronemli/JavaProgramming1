package day39_Recap.animalTask;

public class FriendlyAnimal extends Animal {
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

    public FriendlyAnimal(String name, String breed, char gender, int age, String size, String color,
                          boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color);
        setWild(isWild);
        setPlayable(isPlayable);
        setFriendly(isFriendly);
    }

    public void play() {
        System.out.println(getName()+ " is playing");
    }

    public void pet() {
        System.out.println(getName()+ " " + getBreed() +" is getting petted");
    }


}

/*
2. Create a sub class of Animal named FriendlyAnimal:
				Variable:
					isWild
					isFriendly
					isPlayable

				Extra methods:
					play()
					pet()
 */
/*
4. Create the following sub-classes of FriendlyAnimal and Override the eat method
        1. Dog:
        Extra methods:
        bark()

        2. Cat:
        Extra methods:
        scratch()
        meow()

        3. Dolphin:
        Extra methods:
        swim()

        4. Parrot:
        Extra methods:
        fly()
        sing()

 */