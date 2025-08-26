package Day_9;

import java.util.*;

class City {
    String name;
    int population;
    City(String name, int population) {
        this.name = name;
        this.population = population;
    }
    public String toString() {
        return name + " - " + population;
    }
}
public class SortCities_Population {
    public static void main(String[] args) {
        List<City> cities = new ArrayList<>();
        cities.add(new City("Hyderabad", 20800000));
        cities.add(new City("Pune", 2060000));
        cities.add(new City("Bangalore", 1230000));
        cities.sort(Comparator.comparingInt(city -> city.population));
        for (City c : cities) {
            System.out.println(c);
        }
    }
}

