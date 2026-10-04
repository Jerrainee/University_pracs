package prac1_4.p4_1;

public class Processor {
    private String model;
    private int cores;
    private double clockSpeedGhz;

    public Processor(String model, int cores, double clockSpeedGhz) {
        this.model = model;
        this.cores = cores;
        this.clockSpeedGhz = clockSpeedGhz;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public double getClockSpeedGhz() {
        return clockSpeedGhz;
    }

    public void setClockSpeedGhz(double clockSpeedGhz) {
        this.clockSpeedGhz = clockSpeedGhz;
    }

    @Override
    public String toString() {
        return model + " (" + cores + " ядер, " + clockSpeedGhz + " ГГц)";
    }
}
