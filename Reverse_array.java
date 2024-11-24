package Java;
import java.util.Scanner;

public class Reverse_array {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n=scanner.nextInt();
        int []arr=new int[n];
        int []rev=new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }
        int j=n-1;
        for(int i=0;i<n;i++)
        {
            rev[j]=arr[i];
            j--;
        }
        System.out.print("The reverse of array is ");
        for(int i=0;i<n;i++)
        {
            System.out.print(rev[i] + " ");
        }
    
    }

}
