import java.util.Scanner;

public class BaseConversion {
    
        // Function to convert Decimal to Hexadecimal manually
        String decToHex(int n){
        // Creating an array to store octal number
        int[] hexNum = new int[100];
        String hex="";
        // counter for hexadecimal number array
        int i = 0;
        while (n != 0) {

            // Storing remainder in hexadecimal array
            hexNum[i] = n % 16;
            n = n / 16;
            i++;
        }

        // Printing hexadecimal number array
        // in the reverse order
        for (int j = i - 1; j >= 0; j--) {
            if (hexNum[j] > 9)
                hex += (char)(55 + hexNum[j]);
            else
               hex += hexNum[j];
        }
        return hex;
    }

    // Function to convert Hexadecimal to Decimal manually
    int hexToDec(String hex) {
        int decimal = 0;
        int base = 1;  // Initial power of 16^0

        for (int i = hex.length() - 1; i >= 0; i--) {
            char hexChar = hex.charAt(i);

            if (hexChar >= '0' && hexChar <= '9') {
                decimal += (hexChar - '0') * base;
            } else if (hexChar >= 'A' && hexChar <= 'F') {
                decimal += (hexChar - 'A' + 10) * base;
            }

            base *= 16;
        }

        return decimal;
    }

    public static void main(String[] args) {
        BaseConversion obj = new BaseConversion();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("------Menu------");
            System.out.println("1. Convert Decimal to Hexadecimal");
            System.out.println("2. Convert Hexadecimal to Decimal");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Convert Decimal to Hexadecimal
                    System.out.print("Enter a decimal number: ");
                    int decimalNumber = sc.nextInt();
                    String hexResult = obj.decToHex(decimalNumber);
                    System.out.println("The hexadecimal equivalent of " + decimalNumber + " is " + hexResult);
                    break;

                case 2:
                    // Convert Hexadecimal to Decimal
                    System.out.print("Enter a hexadecimal number: ");
                    String hexNumber = sc.next().toUpperCase();
                    int decimalResult = obj.hexToDec(hexNumber);
                    System.out.println("The decimal equivalent of " + hexNumber + " is " + decimalResult);
                    break;

                case 3:
                    System.out.println("Exiting the program...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 3);

    }


}
