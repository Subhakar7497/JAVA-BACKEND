// Import the HashSet class
import java.util.HashSet;

public class AddMethod {
  public static void main(String[] args) {
    HashSet<String> cars = new HashSet<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("BMW");
    cars.add("Audi");
    System.out.println(cars);
  }
}
