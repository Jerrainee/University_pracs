package block2.prac13.task3;

public class Address {
    String country, region, city, street, house, building, apartment;

    public void parseWithSplit(String addressStr) {
        String[] parts = addressStr.split(",");
        country = parts[0].trim();
        region = parts[1].trim();
        city = parts[2].trim();
        street = parts[3].trim();
        house = parts[4].trim();
        building = parts[5].trim();
        apartment = parts[6].trim();
    }
    @Override
    public String toString() {
        return country + ", " + region + ", " + city + ", " + street + ", д. " + house;
    }
}

