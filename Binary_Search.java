package Java;
import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n=scanner.nextInt();
        System.out.println("Enter elements");
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }
        System.out.println("Enter element to be searched");
        int x=scanner.nextInt();
        int index=Binary(arr,n,x);
        System.out.println("Element found at index " + index);
    }
    public static int Binary(int[] arr,int n,int x)
    {
        int ind=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x)
            {
                ind=i;
                break;
            }
            else
            {
                ind=-1;
            }
        }
        return ind;
    }

}
