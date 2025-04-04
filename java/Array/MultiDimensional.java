import java.util.Scanner;

public class MultiDimensional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for the size of the 3D array
        System.out.print("Enter the number of layers: ");
        int layers = scanner.nextInt();
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Declare and initialize the 3D array
        int[][][] array3D = new int[layers][rows][cols];

        // Input array elements from the user
        System.out.println("Enter the elements of the 3D array:");
        for (int i = 0; i < layers; i++) {
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < cols; k++) {
                    System.out.print("Element at [" + i + "][" + j + "][" + k + "]: ");
                    array3D[i][j][k] = scanner.nextInt();
                }
            }
        }

        // Print the 3D array
        System.out.println("\n3D Array Output:");
        for (int i = 0; i < layers; i++) {
            System.out.println("Layer " + (i + 1) + ":");
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < cols; k++) {
                    System.out.print(array3D[i][j][k] + " ");
                }
                System.out.println(); // Move to the next row
            }
            System.out.println(); // Move to the next layer
        }

        // Close the scanner
        scanner.close();
    }
}
