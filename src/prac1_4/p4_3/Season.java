package prac1_4.p4_3;

public enum Season {
    WINTER(-15),
    SPRING(10),
    SUMMER(25) {
        @Override
        public String getDescription() {
            return "теплое время года";
        }
    },
    AUTUMN(5);

    private double averageTemperature;

    Season(double averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public double getAverageTemperature() {
        return averageTemperature;
    }

    public String getDescription() {
        return "холодное время года";
    }
}
