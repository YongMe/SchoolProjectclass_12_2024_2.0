//A program to perform bubble sort and binary search on a set of inegers
import java.util.Scanner;
class Sort
{
    int ar[] = new int[50];
    int n, i;
    int item;
    void inputdata()
    
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array to maximum 50: ");
        n = in.nextInt( );
        for(i=0; i<n; i++ )
        {
            System.out.println("Enter a number: ");
            ar[i] = in.nextInt( );
        }
    }
    // Method to perform bubble sort on the arra
    void bubsort( )
    {
        int j, temp;
        for(i=0; i<(n-1); i++ )
        {
            for(j=0; j<(n-1)-i; j++ )
            {
                if(ar[j] > ar[j + 1])
                {
                    temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                }
            }
        }
        System.out.println("Elements of the sorted array are: ");
        for(i=0; i<n; i++ )
        {
            System.out.print(ar[i]);
            System.out.println( );
        }
    }
    // Method to perform binary search on the sorted array
    void binsearch( )
    {
        int lb, ub, mid, found = 0, item;
        lb = 0;
        ub = n - 1;
        mid = 0;
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the number to be searched: ");
        item = in.nextInt( );
        while(found == 0 && lb <= ub)
        {
            mid = (lb + ub) / 2;
            if(item < ar[mid])
                ub = mid;
            if(item > ar[mid])
                lb = mid;
            if(item == ar[mid])
                found = 1;
        }
        if(found == 1){
            System.out.println("Search successful !!! ");
            System.out.println("The number found at position: " + mid);
        }
        else
            System.out.println("No such element is present in the array !!! ");
    }
}
            
