public class AlphabetPyramid {

    public static void main(String[] args) {
        int n = 9; // Number of rows

        // Loop through each row
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            
            // Print alphabet characters from 'A' to the ith letter
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            
            // Move to the next line
            System.out.println();
        }
    }
}
