import java.util.Scanner;

public class LetterReplacement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Accept input string
        System.out.print("Enter the string: ");
        String input = sc.nextLine();
        
        String result = "";
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // If character is uppercase
            if (ch >= 'A' && ch <= 'Z') {
                if (ch == 'Z') {
                    result += 'a';
                } else {
                    result += (char) (ch + 1 + 32); // Move to next char and convert to lowercase
                }
            }
            // If character is lowercase
            else if (ch >= 'a' && ch <= 'z') {
                if (ch == 'z') {
                    result += 'A';
                } else {
                    result += (char) (ch + 1 - 32); // Move to next char and convert to uppercase
                }
            } else {
                // For non-alphabetic characters, append them as is
                result += ch;
            }
        }

        // Print the resulting string
        System.out.println("Output: " + result);

    }
}
