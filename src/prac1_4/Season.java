package prac1_4;

public enum Season {
    WINTER(-10) {

    },
    SPRING(5) {

    },
    SUMMER(22) {
        @Override
        public String getDescription() {
            return "Тёплое время года";
        }
    },
    AUTUMN(8) {

    };

    private final double averageTemperature;

    Season(double averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public double getAverageTemperature() {
        return averageTemperature;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}
