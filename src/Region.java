import java.util.ArrayList;
import java.util.List;

// Enum for Region Types
enum RegionType {
    CITY, STATE, COUNTRY;
}

// Base class: Region
public class Region {
    protected String name;

    public Region(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printInfo() {
        System.out.println("Region: " + name);
    }
}