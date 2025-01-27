package Java;
import java.util.Scanner;

public class Upperbound {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n=scanner.nextInt();
        int []arr=new int[n];
        System.out.println("Enter elements ");
        for(int i=0;i<n;i++)
        {
        arr[i]=scanner.nextInt();
        System.out.println("");
        }
        System.out.println("Enter number of which upper bound is needed");
        int x=scanner.nextInt();
        int res=upperBound(arr, x, n);
        System.out.println("The upper bound is at index " + res);
    }

    public static int upperBound(int []arr, int x, int n){
        // Write your code here.
        int []res=new int[n];
        int p=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>x)
            {
                res[i]=arr[i];
            }
        }
        int r=Max(arr,n);
        for(int j=0;j<n;j++)
        {
            if(res[j]!=0 && res[j]<=r)
            {
                r=res[j];
                p=j;
            }   
        }
        System.out.println("The upper bound is " + r);
        return p;
    }

    public static int Max(int []arr,int n)
    {
        int r=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>r)
            {
                r=arr[i];
            }
        }
        return r;
    }

}
