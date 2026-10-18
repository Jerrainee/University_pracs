package block2.prac13;
// Тестовый класс для практической работы 13
public class Tester {

    public static void main(String[] args) {

        // 1
        System.out.println("задание 1");
        StringOperations.process("I like Java!!!");

        // 2
        System.out.println();
        System.out.println("задание 2");
        Person p1 = new Person("aaa", "bbb", "ccc");
        System.out.println(p1.getShortName());
        Person p2 = new Person("aaa", "bbb", null);
        System.out.println(p2.getShortName());
        Person p3 = new Person("aaa", null, null);
        System.out.println(p3.getShortName());

        // 4
        System.out.println();
        System.out.println("задание 4");
        String[] shirts = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White T-Shirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";

        Shirt[] shirtObjects = new Shirt[shirts.length];
        for (int i = 0; i < shirts.length; i++) {
            String[] parts = shirts[i].split(",");
            shirtObjects[i] = new Shirt(parts[0], parts[1], parts[2], parts[3]);
        }
        for (int i = 0; i < shirtObjects.length; i++) {
            System.out.println(shirtObjects[i]);
        }

        // 5
        System.out.println("задание 5");
        System.out.println("+79175655655 -> " + PhoneFormatter.format("+79175655655"));
        System.out.println("+104289652211 -> " + PhoneFormatter.format("+104289652211"));
        System.out.println("89175655655 -> " + PhoneFormatter.format("89175655655"));
        System.out.println("12345 -> " + PhoneFormatter.format("12345"));
    }
}
