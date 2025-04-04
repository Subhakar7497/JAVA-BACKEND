import java.util.LinkedList;

public class getLast {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Audi");

        // Use getLast() to display the last item in the list
        System.out.println(cars.getLast());
    }
}
