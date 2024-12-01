package Java;
import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String args[])
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
        arr=Bubble(arr,n);
        print(arr,n);
    }
    public static int[] Bubble(int[] arr,int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
    public static void print(int []arr,int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

}
