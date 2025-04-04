import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        // Create a TreeSet of Integer values
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add(10);
        treeSet.add(5);
        treeSet.add(20);
        treeSet.add(15);
        treeSet.add(30);

        // Display the elements in the TreeSet (sorted order)
        System.out.println("TreeSet elements: " + treeSet);

        // Check if a specific element exists in the TreeSet
        System.out.println("Does the TreeSet contain 15? " + treeSet.contains(15));

        // Remove an element from the TreeSet
        treeSet.remove(5);
        System.out.println("After removing 5: " + treeSet);

        // Find the first and last elements in the TreeSet
        System.out.println("First element: " + treeSet.first());
        System.out.println("Last element: " + treeSet.last());

        // Iterate through the TreeSet using for-each loop
        System.out.print("Iterating through TreeSet: ");
        for (Integer num : treeSet) {
            System.out.print(num + " ");
        }
    }
}
