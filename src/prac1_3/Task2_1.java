package prac1_3;


public class Task2_1 {
    public static void main(String[] args) {

        Double d1 = Double.valueOf(3.14); // из примитива
        Double d2 = Double.valueOf("2.71"); // из строки
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println();

        String s = "12.34";
        double sr = Double.parseDouble(s);
        System.out.println(sr);
        System.out.println();

        Double dd = Double.valueOf(12.3);
        System.out.println("#3");
        System.out.println("byte: " + dd.byteValue());
        System.out.println("short: " + dd.shortValue());
        System.out.println("int: " + dd.intValue());
        System.out.println("long: " + dd.longValue());
        System.out.println("float: " + dd.floatValue());
        System.out.println();

        System.out.println("double: " + dd);
        System.out.println();

        String d5 = Double.toString(3.14);
        System.out.println(d5);
    }
}
