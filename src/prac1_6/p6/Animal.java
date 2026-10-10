package prac1_6.p6;

public class Animal implements Nameable {

    private String nickname; // кличка

    public Animal(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String getName() {
        return nickname;
    }
}
