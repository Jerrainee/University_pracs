package block4.prac19.task1;

/**
 * Практическая работа № 19. Задание 1.
 * Класс клиента интернет-магазина.
 */
public class Client {
    private final String fullName; // фио
    private final String inn;      // инн

    public Client(String fullName, String inn) {
        this.fullName = fullName;
        this.inn = inn;
    }

    public String getFullName() {
        return fullName;
    }

    public String getInn() {
        return inn;
    }

    @Override
    public String toString() {
        return "клиент: " + fullName + " инн: " + inn;
    }
}
