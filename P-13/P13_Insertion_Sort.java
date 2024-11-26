import java.util.*;
class Insertion_sort
{
    int ar[], n;
    Scanner sc = new Scanner(System.in);

    Insertion_sort()
    {
        n = 0;
    }

    void accept()
    {
        System.out.println("ENTER SIZE OF ARRAY");
        n = sc.nextInt();
        ar = new int[n];
        System.out.println("ENTER ARRAY ELEMENTS");
        for (int i = 0; i < n; i++)
        {
            ar[i] = sc.nextInt();
        }
    }

    void sort()
    {
        int val, p;
        for (int i = 1; i < n; i++)
        {
            val = ar[i];
            p = i - 1;
            while (p >= 0 && ar[p] > val)
            {
                ar[p + 1] = ar[p];
                p--;
            }
            ar[p + 1] = val;
        }
    }

    void display()
    {
        System.out.println("THE SORTED IS :");
        for (int i = 0; i < n; i++)
        {
            System.out.print(ar[i] + " ");
        }
    }

    public static void main()
    {
        Insertion_sort ob = new Insertion_sort();
        ob.accept();
        ob.sort();
        ob.display();
    }
}
// end of main
// end of class
