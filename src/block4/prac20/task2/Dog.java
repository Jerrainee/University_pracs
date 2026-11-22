package block4.prac20.task2;

import java.io.Serializable;

public class Dog extends Animal implements Serializable {

    private final String breed;
    private final String name;

    public Dog(String breed, String name) {
        super("собака");
        this.breed = breed;
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "собака: " + name;
    }
}
