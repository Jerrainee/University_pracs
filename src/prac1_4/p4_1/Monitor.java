package prac1_4.p4_1;

public class Monitor {
    private double sizeInches;
    private String resolution;

    public Monitor(double sizeInches, String resolution) {
        this.sizeInches = sizeInches;
        this.resolution = resolution;
    }

    public double getSizeInches() {
        return sizeInches;
    }

    public void setSizeInches(double sizeInches) {
        this.sizeInches = sizeInches;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return sizeInches + "\" (" + resolution + ")";
    }
}
