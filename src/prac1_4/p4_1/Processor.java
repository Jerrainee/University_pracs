package prac1_4.p4_1;

public class Processor {
    private String model;
    private int cores;
    private double Ghz;

    public Processor(String model, int cores, double Ghz) {
        this.model = model;
        this.cores = cores;
        this.Ghz = Ghz;
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

    public double getGhz() {
        return Ghz;
    }

    public void setGhz(double ghz) {
        this.Ghz = ghz;
    }

    @Override
    public String toString() {
        return model + " (" + cores + " ядер, " + Ghz + " ГГц)";
    }
}
