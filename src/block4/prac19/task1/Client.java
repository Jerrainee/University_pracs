package block4.prac19.task1;

public class Client {
    private final String fullName;
    private final String inn;

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
