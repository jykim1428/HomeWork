// State class
import java.util.ArrayList;
import java.util.List;

class State extends Region {
    private List<City> cities;

    public State(String name) {
        super(name);
        this.cities = new ArrayList<>();
    }

    public void addCity(City city) {
        cities.add(city);
    }

    public void printCities() {
        System.out.println("State: " + name);
        for (City city : cities) {
            city.printInfo();
            if (city.isLargeCity()) {
                System.out.println(city.getName() + " is a large city.");
            }
        }
    }

    public List<City> getCities() {
        return cities;
    }

    // Inner class for additional city details
    public class CityDetails {
        private String history;

        public CityDetails(String history) {
            this.history = history;
        }

        public void printHistory() {
            System.out.println("History of " + name + ": " + history);
        }
    }
}

