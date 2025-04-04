
// Java program to  clear() method
// in ArrayList of Strings
import java.util.ArrayList;

public class clear {
    public static void main(String[] args) {

        // Creating an ArrayList of strings
        ArrayList<String> a = new ArrayList<>();

        // Adding elements to the ArrayList
        a.add("Dog");
        a.add("Cat");
        a.add("Rabbit");

        System.out.println("" + a);

        // Clearing all elements
        // from the ArrayList
        a.clear();

        // Printing the ArrayList after clearing
        System.out.println("" + a);
    }
}