package Java;
import java.util.Scanner;

public class Sum_series1 // printing sum of series: 1!/1+2!/2+3!/3+4!/4....n!/n
{
    public static void main(String[] args)
    {    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of terms");
        int n = scanner.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            int fact=1;
            for(int j=1;j<=i;j++)
            {
                fact=fact*j;
            }
            sum=sum+(fact/i);
        }
        System.out.println(sum);
    }

}
