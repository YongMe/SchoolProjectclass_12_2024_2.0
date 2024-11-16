import java.util.Scanner;

public class DayNumberToDate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept year input
        System.out.print("Enter a year (4 digits): ");
        int year = sc.nextInt();

        // Accept day input
        System.out.print("Enter a day number (1-366): ");
        int day = sc.nextInt();

        // Validate the input
        if (year < 1000 || year > 9999) {
            System.out.println("Please enter a valid 4-digit year.");
            return;
        }

        if (day < 1 || day > 366) {
            System.out.println("Day must be between 1 and 366.");
            return;
        }

        // Adjust for leap years
        if (!(year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) && day == 366) {
            System.out.println("Day 366 is only valid for leap years.");
            return;
        }

        // Month days array
        int[] monthDays = {31, ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? 28 : 29), 31, 30, 31, 30, 
                           31, 31, 30, 31, 30, 31};
        String[] monthNames = {"January", "February", "March", "April", "May", "June",
                               "July", "August", "September", "October", "November", "December"};

        // Calculate the month and day
        int month = 0;
        while (day > monthDays[month]) {
            day -= monthDays[month];
            month++;
        }

        // Output the result
        System.out.printf("The corresponding date is: "+ day+" "+monthNames[month]+" "+year);
    }
}
