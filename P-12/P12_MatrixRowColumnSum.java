import java.util.Scanner;

public class MatrixRowColumnSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, rsum=0, csum=0, r, c;
        // Get the size of the matrix from the user
        System.out.print("Enter the number of rows: ");
        r = sc.nextInt();
        
        System.out.print("Enter the number of columns: ");
        c = sc.nextInt();
        
        // Initialize the matrix
        int[][] ar = new int[r][c];
        
        // Input matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                ar[i][j] = sc.nextInt();
            }
        }
        
        // Calculate and display the sum of each row
        System.out.println("\nSum of each row:");
        for (i = 0; i < r; i++) {
            rsum=0;
            for (j = 0; j < c; j++) {
                rsum += ar[i][j];
            }
            System.out.println("Row no." + (i + 1) + " sum: " + rsum);
        }
        
        // Calculate and display the sum of each column
        System.out.println("\nSum of each column:");
        for (j = 0; j < c; j++) {
            csum = 0;
            for (i = 0; i < r; i++) {
                csum += ar[i][j];
            }
            System.out.println("Column no." + (j + 1) + " sum: " + csum);
        }

    }
}
