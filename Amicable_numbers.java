package Java;
import java.util.Scanner;

public class Amicable_numbers {
    public static void main(String[] args)
    {
        System.out.println("Enter two numbers");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int sum1=0;
        int sum2=0;
        for(int i=1;i<x;i++)
        {
            if(x%i==0)
            {
                sum1=sum1+i;
            }
            else{
                continue;
            }
        }
        for(int j=1;j<y;j++)
        {
            if(y%j==0)
            {
                sum2=sum2+j;
            }
            else
            {
                continue;
            }
        }
        if(x==sum2 && y==sum1)
        {
            System.out.print("Numbers ");
            System.out.print(x);
            System.out.print(" and ");
            System.out.print(y);
            System.out.print(" are amicable numbers");
        }
        else
        {
            System.out.print("Numbers ");
            System.out.print(x);
            System.out.print(" and ");
            System.out.print(y);
            System.out.print(" are not amicable numbers");
        }
    }

}
