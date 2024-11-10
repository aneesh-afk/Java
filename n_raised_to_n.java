package Java;
import java.util.Scanner;

public class n_raised_to_n {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n");
        int n = scanner.nextInt();
        int result=0;
        for(int i=1;i<=n;i++)
        {
            int exp=1;
            for(int j=1;j<=i;j++)
            {
                exp=exp*i;
            }
            result=exp;
        }
        System.out.println(result);
    }

}
