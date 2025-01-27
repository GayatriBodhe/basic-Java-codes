import java.util.Scanner;

public class ChangeRowsColumns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Input the 2D array
        int[][] originalArray = new int[rows][columns];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                originalArray[i][j] = scanner.nextInt();
            }
        }

        // Print the original array
        System.out.println("Original Array:");
        printArray(originalArray);

        // Change rows and columns
        int[][] changedArray = changeRowsColumns(originalArray);

        // Print the array after changing rows and columns
        System.out.println("\nArray after changing rows and columns:");
        printArray(changedArray);

        scanner.close();
    }

    // Method to change rows and columns of the array
    private static int[][] changeRowsColumns(int[][] array) {
        int rows = array.length;
        int columns = array[0].length;

        // Create a new array with swapped rows and columns
        int[][] changedArray = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                changedArray[j][i] = array[i][j];
            }
        }

        return changedArray;
    }

    // Method to print a 2D array
    private static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
