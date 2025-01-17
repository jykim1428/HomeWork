//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// Main.java
public class Main {
    public static void main(String[] args) {
        // 국가 생성
        Country country = new Country("대한민국");

        // 주 생성 및 추가
        State seoul = new State("서울특별시");
        State busan = new State("부산광역시");
        State daegu = new State("대구광역시");
        State incheon = new State("인천광역시");

        country.addState(seoul);
        country.addState(busan);
        country.addState(daegu);
        country.addState(incheon);

        // 서울특별시 - 도시 추가
        seoul.addCity(new City("강남구", 500000));
        seoul.addCity(new City("송파구", 400000));
        seoul.addCity(new City("종로구", 150000));
        seoul.addCity(new City("은평구", 300000));

        // 부산광역시 - 도시 추가
        busan.addCity(new City("해운대구", 300000));
        busan.addCity(new City("수영구", 200000));
        busan.addCity(new City("동래구", 250000));
        busan.addCity(new City("사하구", 220000));

        // 대구광역시 - 도시 추가
        daegu.addCity(new City("중구", 180000));
        daegu.addCity(new City("달서구", 350000));
        daegu.addCity(new City("수성구", 400000));
        daegu.addCity(new City("북구", 320000));

        // 인천광역시 - 도시 추가
        incheon.addCity(new City("남동구", 300000));
        incheon.addCity(new City("부평구", 350000));
        incheon.addCity(new City("계양구", 200000));
        incheon.addCity(new City("연수구", 250000));

        // 데이터 출력
        country.printStates();

        // 파일 저장
        System.out.println("Saving data to file...");
        country.saveToFile();

        // 멀티스레드로 출력
        System.out.println("Printing using threads...");
        Thread thread = new Thread(() -> {
            country.printStates();
        });
        thread.start();
    }
}

