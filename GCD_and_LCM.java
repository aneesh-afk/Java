package Java;
import java.util.Scanner;

public class GCD_and_LCM {
    public static void main(String[] args)
    {
        System.out.println("Enter two numbers");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int min=Math.min(x,y);
        int GCD=0;
        for(int i = 1;i<=min;i++)
        {
            if(x%i==0 && y%i==0)
            GCD=i;
        }
        int LCM = x*y/GCD;
        System.out.print("GCD is ");
        System.out.println(GCD);
        System.out.print("LCM is ");
        System.out.println(LCM);
    }


}
