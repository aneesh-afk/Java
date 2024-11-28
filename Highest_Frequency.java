package Java;
import java.util.Scanner;

public class Highest_Frequency {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of elements");
        int Size=scanner.nextInt();
        int arr[]=new int[Size];
        int c[]=new int[Size];
        System.out.println("Enter elements");
        for(int i=0;i<Size;i++)
        {
            arr[i]=scanner.nextInt();
        }
        for(int i=0;i<Size;i++)
        {
            int count=0;
            int a=arr[i];
            for(int j=0;j<Size;j++)
            {
                if(a==arr[j])
                {
                    count++;
                }
            }
            c[i]=count;
        }
        int high=0;
        int h=0;
        int low=214331843;
        int l=0;
        for(int k=0;k<Size;k++)
        {
            if(high<c[k])
            {
                high=c[k];
                h=k;
            }
            else if(high==c[k])
            {
                if(arr[h]<arr[k])
                {
                    continue;
                }
                else
                {
                    high=c[k];
                    h=k;
                }
            }
            if(low>c[k])
            {
                low=c[k];
                l=k;
            }
            else if(low==c[k])
            {
                if(arr[l]<arr[k])
                {
                    continue;
                }
                else
                {
                    low=c[k];
                    l=k;
                }
            }
        }
        System.out.println("The highest frequency count is " + high + " and element is " + arr[h]);
        System.out.println("The lowest freqency count is " + low + " and the element is " + arr[l]);
    }

}
