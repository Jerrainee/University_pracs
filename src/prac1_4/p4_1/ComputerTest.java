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
                "MacBook Neo",
                new Processor("Apple A18 Pro", 6, 4.0),
                new Memory(8, "LPDDR5"),
                new Monitor(13, "2408x1506")
        );

        System.out.println("ноут 1");
        System.out.println(computer1);

        System.out.println("ноут 2");
        System.out.println(computer2);

        System.out.println();
        computer1.setMemory(new Memory(32, "DDR4"));
        System.out.println("апгрейд памяти");
        System.out.println(computer1);
    }
}
