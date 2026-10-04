package prac1_4.p4_1;

public class Memory {
    private int capacityGb;
    private String type;

    public Memory(int capacityGb, String type) {
        this.capacityGb = capacityGb;
        this.type = type;
    }

    public int getCapacityGb() {
        return capacityGb;
    }

    public void setCapacityGb(int capacityGb) {
        this.capacityGb = capacityGb;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return capacityGb + " ГБ " + type;
    }
}
