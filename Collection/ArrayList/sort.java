import java.util.ArrayList;

public class sort {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Audi");
        cars.sort(null);
        System.out.println(cars);
    }
}