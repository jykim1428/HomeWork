import java.util.ArrayList;  // ArrayList를 사용하기 위한 임포트
import java.util.List;       // List 인터페이스를 사용하기 위한 임포트

public class Country extends Region {
    private List<State> states;  // List를 사용하여 주(State) 관리

    public Country(String name) {
        super(name);
        this.states = new ArrayList<>();  // ArrayList로 초기화
    }

    public void addState(State state) {
        states.add(state);
    }

    public void printStates() {
        System.out.println("Country: " + name);
        for (State state : states) {
            state.printCities();
        }
    }

    public void saveToFile() {
        try (java.io.FileWriter writer = new java.io.FileWriter("output.txt")) {
            writer.write("Country: " + name + "\\n");
            for (State state : states) {
                writer.write("State: " + state.getName() + "\\n");
                for (City city : state.getCities()) {
                    writer.write("  City: " + city.getName() + "\\n");
                }
            }
        } catch (Exception e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
