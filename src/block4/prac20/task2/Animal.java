package block4.prac20.task2;

/**
 * Практическая работа № 20. Задание 3.
 * Базовый класс Animal.
 */
public class Animal {
    private final String species;

    public Animal(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    @Override
    public String toString() {
        return "животное: " + species;
    }
}
