import java.util.ArrayList;
import java.util.List;

class City extends Region {
    private int population;

    public City(String name, int population) {
        super(name);
        if (population < 0) {
            throw new IllegalArgumentException("Population cannot be negative");
        }
        this.population = population;
    }

    @Override
    public void printInfo() {
        System.out.println("City: " + name + ", Population: " + population);
    }

    public boolean isLargeCity() {
        return population > 300000;
    }
}

