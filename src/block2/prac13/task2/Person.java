package block2.prac13.task2;
public class Person {

    private String surname;
    private String name;
    private String patronymic;

    public Person(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public String getShortName() {
        StringBuilder result = new StringBuilder();
        result.append(surname);

        boolean hasName = name != null && name.length() > 0;
        boolean hasPatronymic = patronymic != null && patronymic.length() > 0;
        if (hasName) {
            result.append(" ").append(name.charAt(0)).append(".");
        }
        if (hasPatronymic) {
            if (!hasName) {
                result.append(" ");
            }
            result.append(patronymic.charAt(0)).append(".");
        }
        return result.toString();
    }
}
