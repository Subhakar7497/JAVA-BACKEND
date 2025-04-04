import java.util.ArrayList;

public class Empty {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();

        System.out.println(cars.isEmpty());

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Audi");

        System.out.println(cars.isEmpty());

    }
}