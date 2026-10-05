package prac1_4.p4_2;

public class TransportTester {

    public static void main(String[] args) {

        double distance = 1000;
        int passengers = 3;
        double tons = 2;

        System.out.println("расстояние: " + distance + " км, пассажиров: "
                + passengers + ", груза: " + tons + " т");
        System.out.println();

        System.out.println("автомобиль");
        Car car = new Car();
        System.out.println("время в пути: " + car.getTime(distance) + " ч");
        System.out.println("пассажиры: " + car.getPassengerCost(distance, passengers) + " руб.");
        System.out.println("груз: " + car.getCargoCost(distance, tons) + " руб.");

        System.out.println();

        System.out.println("самолёт");
        Plane plane = new Plane();
        System.out.println("время в пути: " + plane.getTime(distance) + " ч");
        System.out.println("пассажиры: " + plane.getPassengerCost(distance, passengers) + " руб.");
        System.out.println("груз: " + plane.getCargoCost(distance, tons) + " руб.");

        System.out.println();

        System.out.println("поезд");
        Train train = new Train();
        System.out.println("время в пути: " + train.getTime(distance) + " ч");
        System.out.println("пассажиры: " + train.getPassengerCost(distance, passengers) + " руб.");
        System.out.println("груз: " + train.getCargoCost(distance, tons) + " руб.");

        System.out.println();

        System.out.println("корабль");
        Ship ship = new Ship();
        System.out.println("время в пути: " + ship.getTime(distance) + " ч");
        System.out.println("пассажиры: " + ship.getPassengerCost(distance, passengers) + " руб.");
        System.out.println("груз: " + ship.getCargoCost(distance, tons) + " руб.");

    }
}