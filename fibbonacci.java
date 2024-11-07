package Java;
import java.util.Scanner;

public class fibbonacci {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of terms");
        int n = scanner.nextInt();
        int f0=0;
        int f1=1;
        System.out.println(f0);
        System.out.println(f1);
        for(int i=0;i<n;i++)
        {
            int f2=f0+f1;
            System.out.println(f2);
            f0=f1;
            f1=f2;
        }

    }
    
}
