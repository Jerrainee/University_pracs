package prac1_4.p4_1;

public class Computer {
    private ComputerBrand brand;
    private String model;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(ComputerBrand brand, String model, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    public ComputerBrand getBrand() {
        return brand;
    }

    public void setBrand(ComputerBrand brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return brand + " " + model
                + "\n  Процессор: " + processor
                + "\n  Память:    " + memory
                + "\n  Монитор:   " + monitor;
    }
}
