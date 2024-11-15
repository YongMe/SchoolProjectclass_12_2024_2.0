import java.util.*;

class SeriesSum {
    int x, n;
    double sum;

    SeriesSum(int xx, int nn) {
        x = xx;
        n = nn;
    }

    double FindFact(int m) {
        if (m == 0)
            return 1;
        else
            return (m * FindFact(m - 1));
    }

    double FindPower(int x, int y) {
        if (y == 0)
            return 1;
        else
            return (x * FindPower(x, y - 1));
    }

    void calculate() {
        double t;
        for(int i=1;i<=n;i++)
        {
            t=(double)(FindPower(x, 2*i)/FindFact(2*i-1));
            sum = sum + t;
        }
    }
    void display()
    {
        System.out.println("Sum of the series: " + sum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of x and n:");
        int x = sc.nextInt();
        int n = sc.nextInt();
        SeriesSum ob = new SeriesSum(x, n);
        ob.calculate();
        ob.display();
    }
}
