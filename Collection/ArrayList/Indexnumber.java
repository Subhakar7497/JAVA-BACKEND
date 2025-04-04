import java.util.ArrayList;

public class Indexnumber {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");

        cars.add(2, "Audi");
        System.out.println(cars);
    }
}
