//A program to dispay the sorted integers using selection sort
import java.util.Scanner;

class Sorter
{
  int ar[] = new int[100];
  int n, i;
  Sorter()
  {
      for(i=0; i<100; i++ )
          ar[i]=0;
  }
  Sorter(int nx)// to define array size
  {
      n=nx;
  }
  void readlist( )
  {
      Scanner in = new Scanner (System.in);
      for(i=0; i<n; i++ )
      {
          System.out.println("Enter a number: ");
          ar[i]=in.nextInt( );
      }
  }
  void displaylist( )
  {
      System.out.println("The sorted list: ");
      for(i=0; i<n; i++ )
      {
          System.out.print(ar[i]);
          System.out.println( );
      }
  }
  int indexofmin(int startindex)
  {
      int min=startindex; int j;
      for(j=startindex+1; j<n; j++ )
      {
          if(ar[j]<ar[min])
              min=j;
      }
      return(min);
  }
  void selectionsort( )
  {
      int temp, m;
      for(i=0; i<n-1; i++ )
      {
          m=indexofmin(i);
          temp=ar[i];
          ar[i]=ar[m];
          ar[m]=temp;
      } // end of i loop
  }
}
