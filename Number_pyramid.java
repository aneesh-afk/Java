package Java;
import java.util.Scanner;

public class Number_pyramid {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row = scanner.nextInt();
        int rows=2*row-1;
        int mid=rows/2+1;
        int mid1=mid;
        int mid2=mid;
        int k=1;
        for(int i=1;i<=row;i++)
        {
        for(int j=1;j<=rows;j++)
        {
            
            if(j>=mid1 && j<=mid2)
            {
                System.out.print(k);
                k++;
            }
            else
            {
                System.out.print(" ");
            }
            
            
        }
        k=1;
        mid1--;
        mid2++;
        System.out.println("");
    }
    }

}
