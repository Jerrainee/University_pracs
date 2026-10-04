package prac1_3;

/**
 * Задания на классы-обёртки (на примере Double):
 * 1. Создание объекта Double через valueOf()
 * 2. Преобразование String в double через Double.parseDouble()
 * 3. Преобразование Double во все примитивные типы
 * 4. Вывод значения Double на консоль
 * 5. Преобразование double в String через Double.toString()
 */
public class Task2_1 {
    public static void main(String[] args) {

        // 1. Создание объекта Double с помощью метода valueOf()
        Double doubleObject = Double.valueOf(3.14);
        System.out.println("1. Double.valueOf(3.14) = " + doubleObject);

        // 2. Преобразование String в double с помощью Double.parseDouble()
        String str = "27.5";
        double parsed = Double.parseDouble(str);
        System.out.println("2. Double.parseDouble(\"" + str + "\") = " + parsed);

        // 3. Преобразование объекта Double во все примитивные типы
        byte byteValue = doubleObject.byteValue();
        short shortValue = doubleObject.shortValue();
        int intValue = doubleObject.intValue();
        long longValue = doubleObject.longValue();
        float floatValue = doubleObject.floatValue();
        double doubleValue = doubleObject.doubleValue();

        System.out.println("3. Преобразование " + doubleObject + " во все примитивные типы:");
        System.out.println("   byte   = " + byteValue);
        System.out.println("   short  = " + shortValue);
        System.out.println("   int    = " + intValue);
        System.out.println("   long   = " + longValue);
        System.out.println("   float  = " + floatValue);
        System.out.println("   double = " + doubleValue);

        // 4. Вывод значения объекта Double на консоль
        System.out.println("4. Значение объекта doubleObject на консоли: " + doubleObject);

        // 5. Преобразование литерала double в строку
        String d = Double.toString(3.14);
        System.out.println("5. Double.toString(3.14) = \"" + d + "\"");
    }
}
