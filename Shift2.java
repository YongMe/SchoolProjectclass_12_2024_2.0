import java.util.Scanner;

public class Encoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine().toUpperCase();

        String encoded = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                char shiftedChar = (char) (ch + 2);
                if (shiftedChar > 'Z') {
                    shiftedChar -= 26;
                }
                encoded += shiftedChar;
            } else {
                encoded += ch;
            }
        }

        System.out.println("Encoded String: " + encoded);

    }
}
