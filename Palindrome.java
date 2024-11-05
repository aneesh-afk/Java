package Java;
import java.util.Scanner;

public class Palindrome 
{
    

    public static void main(String[] args)
    {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int y=a;
        int p=0;
        while(a!=0)
        {
            int rem = a%10;
            a=a/10;
            p=p*10+rem;
        }
        if(p==y)
        {
            System.out.println("Entered number is a palindrome");
        }
        else
        {
            System.out.println("Entered number is not a palindrome");
        }
        
    }

}
