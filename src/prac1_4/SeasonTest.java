package prac1_4;

/**
 * Тестирование перечисления Season.
 */
public class SeasonTest {

    public static void main(String[] args) {

        // 1
        Season favoriteSeason = Season.SUMMER;
        System.out.println("Моё любимое время года");
        System.out.println(favoriteSeason);
        System.out.println("Средняя температура: " + favoriteSeason.getAverageTemperature() + " °C");
        System.out.println("Описание: " + favoriteSeason.getDescription());

        // 2
        printLoveMessage(Season.WINTER);
        printLoveMessage(Season.SPRING);
        printLoveMessage(Season.SUMMER);
        printLoveMessage(Season.AUTUMN);

        // 3
        System.out.println("\n=== Все времена года ===");
        for (Season season : Season.values()) {
            System.out.printf("%-7s | средняя температура: %5.1f °C | %s%n",
                    season, season.getAverageTemperature(), season.getDescription());
        }
    }

    public static void printLoveMessage(Season season) {
        switch (season) {
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
        }
    }
}
