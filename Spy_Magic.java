import java.util.Scanner;

public class MenuDrivenProgram {
     // Method to check if a number is a Spy Number
    boolean isSpyNumber(int num) {
        int sum = 0;
        int product = 1;
        
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }

        return sum == product;
    }

    // Method to check if a number is a Magic Number
    boolean isMagicNumber(int num) {
        while (num > 9) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }

        return num == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MenuDrivenProgram obj = new MenuDrivenProgram();
        int choice;

        do {
            System.out.println("---------Menu---------");
            System.out.println("1. Check if a number is a Spy Number");
            System.out.println("2. Check if a number is a Magic Number");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number to check if it is a Spy Number: ");
                    int spyNumber = sc.nextInt();
                    if (obj.isSpyNumber(spyNumber)) {
                        System.out.println(spyNumber + " is a Spy Number!");
                    } else {
                        System.out.println(spyNumber + " is not a Spy Number.");
                    }
                    break;

                case 2:
                    System.out.print("Enter a number to check if it is a Magic Number: ");
                    int magicNumber = sc.nextInt();
                    if (obj.isMagicNumber(magicNumber)) {
                        System.out.println(magicNumber + " is a Magic Number!");
                    } else {
                        System.out.println(magicNumber + " is not a Magic Number.");
                    }
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
