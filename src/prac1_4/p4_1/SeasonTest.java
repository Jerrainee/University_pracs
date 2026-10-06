package prac1_4.p4_1;

public class SeasonTest {

    public static void main(String[] args) {

        // 1
        Season favoriteSeason = Season.SUMMER;
        System.out.println("моё любимое время года");
        System.out.println(favoriteSeason);
        System.out.println("средняя температура: " + favoriteSeason.getAverageTemperature() + " C");
        System.out.println("описание: " + favoriteSeason.getDescription());

        // 2
        loveSeason(Season.WINTER);
        loveSeason(Season.SPRING);
        loveSeason(Season.SUMMER);
        loveSeason(Season.AUTUMN);

        // 3
        System.out.println();
        System.out.println("все времена года");
        for (Season season : Season.values()) {
            System.out.printf("%-7s | средняя температура: %5.1f C | %s%n",
                    season, season.getAverageTemperature(), season.getDescription());
        }
    }

    public static void loveSeason(Season season) {
        switch (season) {
            case WINTER:
                System.out.println("я люблю зиму");
                break;
            case SPRING:
                System.out.println("я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case AUTUMN:
                System.out.println("я люблю осень");
                break;
        }
    }
}
