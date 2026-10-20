package block2.prac13;

import block2.prac13.task1.Task1;
import block2.prac13.task2.Person;
import block2.prac13.task3.Address;
import block2.prac13.task4.Shirt;
import block2.prac13.task5.PhoneFormatter;
import block2.prac13.task6.Task6;

public class Tester13 {

    public static void main(String[] args) {

        // 1
        System.out.println("задание 1");
        Task1.process("I like Java!!!");

        // 2
        System.out.println();
        System.out.println("задание 2");
        Person p1 = new Person("aaa", "bbb", "ccc");
        System.out.println(p1.getShortName());

        Person p2 = new Person("ab", "bc", null);
        System.out.println(p2.getShortName());

        Person p3 = new Person("a", null, null);
        System.out.println(p3.getShortName());

        Person p4 = new Person("g", "", "f");
        System.out.println(p4.getShortName());

        //3
        System.out.println();
        System.out.println("задание 3");

        Address a1 = new Address();
        a1.parseWithSplit("Россия, Москва, Москва, ул. Ленина, 42, 52, 67");
        System.out.println(a1);

        Address a2 = new Address();
        a2.parseWithSplit("Россия, Москва, Москва, ул. Ленина, 42, , 67");
        System.out.println(a2);

        Address a3 = new Address();
        a3.parseWithSplit("Россия,Москва  Москва, ул., Ленина, 42, 526,      7");
        System.out.println(a3);

        Address a4 = new Address();
        a4.parseWithSplit("  Россия , Кpppppppppppppppppp , ty , tru , t , , r  ");
        System.out.println(a4);


        // 4
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
        System.out.println("+79175655655" + PhoneFormatter.format("+79175655655"));
        System.out.println("+104289652211" + PhoneFormatter.format("+104289652211"));
        System.out.println("89175655655" + PhoneFormatter.format("89175655655"));
        System.out.println("12345" + PhoneFormatter.format("12345"));

    }
}
