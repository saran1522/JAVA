import java.util.*;
public class Arrays{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number of elements in array");
    int n=sc.nextInt();
    int []nums=new int[n];
    System.out.println("enter the array elements");
    for(int i=0;i<n;i++)
        nums[i]=sc.nextInt();
    System.out.println("the array is: ");
    for(int i=0;i<n;i++)
     System.out.print(nums[i]+" ");
  }
}