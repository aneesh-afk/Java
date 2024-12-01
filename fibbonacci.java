package Java;
import java.util.Scanner;

public class fibbonacci {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of terms");
        int n = scanner.nextInt();
        int f2=Fibonacci(n);
        System.out.println(f2);
    }
    public static int Fibonacci(int n)
    {
        int f0=0;
        int f1=1;
        int f2=0;
        for(int i=0;i<n;i++)
        {
            f2=f0+f1;
            f0=f1;
            f1=f2;
        }
        return f2;
    }
    
}
