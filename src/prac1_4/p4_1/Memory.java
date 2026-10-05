package prac1_4.p4_1;

public class Memory {
    private int Gb;
    private String type;

    public Memory(int Gb, String type) {
        this.Gb = Gb;
        this.type = type;
    }

    public int getGb() {
        return Gb;
    }

    public void setGb(int gb) {
        this.Gb = gb;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return Gb + " ГБ " + type;
    }
}
