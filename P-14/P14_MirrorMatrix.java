import java.util.Scanner;

public class MirrorMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MirrorMatrix ob = new MirrorMatrix();
        // Input dimensions of the matrix
        System.out.print("Enter number of rows (m): ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns (n): ");
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        // Input the matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // Display the original matrix
        System.out.println("\nOriginal Matrix:");
        ob.displayMatrix(matrix, m, n);

        // Display the mirrored matrix
        System.out.println("\nMirrored Matrix:");
        ob.displayMirroredMatrix(matrix, m, n);
        
    }

    // Method to display a matrix
    void displayMatrix(int[][] matrix, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Method to display the mirrored matrix
    void displayMirroredMatrix(int[][] matrix, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = n - 1; j >= 0; j--) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
