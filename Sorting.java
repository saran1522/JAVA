import java.util.*;
public class Sorting {
    public static void swap(int arr[], int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void printarray(int arr[], int n) {
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the number of elements: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
         arr[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                  swap(arr,j,j+1);
            }
        }
        System.out.println("the sorted array is: ");
        printarray(arr,n);
    }
    
}
