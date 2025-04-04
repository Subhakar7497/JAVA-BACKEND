import java.util.LinkedList;

public class AddFirst {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");

        // Use addFirst() to add the item to the beginning
        cars.addFirst("Audi");
        System.out.println(cars);
    }
}
