import java.util.Scanner;

public class MatrixOddEvenFrequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the size of the matrix from the user
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        // Initialize the matrix
        int[][] matrix = new int[rows][cols];
        
        // Input matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Variables to store frequency of odd and even numbers
        int oddCount = 0;
        int evenCount = 0;

        // Calculate frequency of odd and even numbers
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
        }

        // Display results
        System.out.println("\nFrequency of even numbers: " + evenCount);
        System.out.println("Frequency of odd numbers: " + oddCount);
    }
}
