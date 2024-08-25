import java.util.Scanner;

public class SpaceReplacer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the character: ");
        char replacementChar = scanner.next().charAt(0);

        String outputString = inputString.replace(' ', replacementChar);

        System.out.println("Output: " + outputString);
    }
}
