// to display Fibonacci series by using recursive technique
import java.util.*;

class Fibo {
    int start;
    int end;
    
    public Fibo() {
        start = end = 0;
    }

    void read() {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Enter start value:");
        start = in.nextInt();
        System.out.print("Enter end value:");
        end = in.nextInt();
    }

    int fibo_series(int a) {
        if (a == 0 || a == 1)
            return a;
        // calling function recursively to display nth term of the Fibonacci Series
        else
            return fibo_series(a - 1) + fibo_series(a - 2);
    }

    public void display() {
        System.out.print("Fibonacci Series:");
        for (int i = start; i < end; i++) {
            int p = fibo_series(i);
            if (p >= start && p <= end)
                System.out.print(fibo_series(i) + " ");
        }
    }

    public static void main(String args[]) {
        Fibo ob = new Fibo();
        ob.read();
        ob.display();
    }
}
