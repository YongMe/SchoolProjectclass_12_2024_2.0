import java.util.Scanner;

public class NumberToWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number less than 10000: ");
        int num = sc.nextInt();

        if (num < 0 || num >= 10000) {
            System.out.println("Please enter a number between 0 and 9999.");
        } else {
            String[] units = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
            String[] teens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
            String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
            String[] thousands = {"", "One Thousand", "Two Thousand", "Three Thousand", "Four Thousand", "Five Thousand", "Six Thousand", "Seven Thousand", "Eight Thousand", "Nine Thousand"};

            String words = "";

            if (num / 1000 > 0) {
                words += thousands[num / 1000] + " ";
                num %= 1000;
            }

            if (num / 100 > 0) {
                words += units[num / 100] + " Hundred ";
                num %= 100;
            }

            if (num >= 10 && num < 20) {
                words += teens[num - 10];
            } else if (num >= 20) {
                words += tens[num / 10] + " ";
                num %= 10;
            }

            if (num > 0 && num < 10) {
                words += units[num];
            }

            System.out.println("In words: " + words.trim());
        }
    }
}
