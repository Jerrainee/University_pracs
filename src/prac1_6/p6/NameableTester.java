package prac1_6.p6;

public class NameableTester {

    public static void main(String[] args) {

        System.out.println("планета");
        Planet planet = new Planet("Земля");
        System.out.println("имя: " + planet.getName());
        System.out.println();

        System.out.println("машина");
        Car car = new Car("Toyota");
        System.out.println("имя: " + car.getName());
        System.out.println();

        System.out.println("животное");
        Animal animal = new Animal("Ватсон");
        System.out.println("имя: " + animal.getName());
        System.out.println();

        System.out.println("интерфейсная ссылка");
        Nameable n = new Planet("Марс");
        System.out.println("имя: " + n.getName());
        System.out.println();

        System.out.println("массив Nameable");
        Nameable[] things = { new Planet("Юпитер"), new Car("BMW"), new Animal("Шарик") };
        for (Nameable thing : things) {
            System.out.println("имя: " + thing.getName());
        }
    }
}
