import java.util.Scanner;

public class KrishnamurthyNumber {
      boolean isKrishnamurthy(int num) {
        int sum = 0;
        int temp = num;

        while (temp != 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        return sum == num;
    }

    int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KrishnamurthyNumber obj = new KrishnamurthyNumber();
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (obj.isKrishnamurthy(num)) {
            System.out.println(num + " is a Krishnamurthy number.");
        } else {
            System.out.println(num + " is not a Krishnamurthy number.");
        }
    }


}
