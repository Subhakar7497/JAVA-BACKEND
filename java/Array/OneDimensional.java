import java.util.Scanner;

public class OneDimensional {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask user for array size
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        // Declare and initialize the array
        int[] numbers = new int[size];

        // Input array elements from the user
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Print the array elements
        System.out.println("Array elements are:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // Close the scanner
        scanner.close();
    }
}
