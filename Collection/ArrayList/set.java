import java.util.ArrayList;

public class set {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Kia");
        cars.set(3, "Audi");
        System.out.println(cars);
    }
}