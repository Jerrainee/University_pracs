package prac1_4.p4_1;


public class ComputerTest {
    public static void main(String[] args) {
        Computer computer1 = new Computer(
                ComputerBrand.ASUS,
                "ROG Strix G15",
                new Processor("AMD Ryzen 7", 8, 3.2),
                new Memory(16, "DDR4"),
                new Monitor(15.6, "1920x1080")
        );

        Computer computer2 = new Computer(
                ComputerBrand.APPLE,
                "MacBook Pro 14",
                new Processor("Apple M3 Pro", 11, 4.0),
                new Memory(18, "LPDDR5"),
                new Monitor(14.2, "3024x1964")
        );

        System.out.println("=== Компьютер 1 ===");
        System.out.println(computer1);

        System.out.println("\n=== Компьютер 2 ===");
        System.out.println(computer2);

        // изменение составной части через сеттер
        computer1.setMemory(new Memory(32, "DDR4"));
        System.out.println("\n=== Компьютер 1 после апгрейда памяти ===");
        System.out.println(computer1);
    }
}
