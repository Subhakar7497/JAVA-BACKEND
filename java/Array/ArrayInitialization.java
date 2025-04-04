public class ArrayInitialization {
    public static void main(String[] args) {
        // 1D Array Initialization
        int[] numbers = { 10, 20, 30, 40, 50 };
        System.out.println("1D Array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // 2D Array Initialization
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println("\n\n2D Array:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // 3D Array Initialization
        int[][][] array3D = {
                {
                        { 1, 2 }, { 3, 4 }
                },
                {
                        { 5, 6 }, { 7, 8 }
                }
        };
        System.out.println("\n3D Array:");
        for (int i = 0; i < array3D.length; i++) {
            for (int j = 0; j < array3D[i].length; j++) {
                for (int k = 0; k < array3D[i][j].length; k++) {
                    System.out.print(array3D[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
