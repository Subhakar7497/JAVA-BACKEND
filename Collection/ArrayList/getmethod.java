
// get() method in ArrayList
import java.util.ArrayList;

public class getmethod {
    public static void main(String[] args) {

        // Creating an ArrayList of Integers
        ArrayList<Integer> arr = new ArrayList<Integer>(3);

        // Adding elements to the ArrayList
        arr.add(10);
        arr.add(20);
        arr.add(30);

        System.out.println("" + arr);

        // Getting the element at index 1
        int e = arr.get(1);

        System.out.println("The element at index 1 is " + e);
    }
}