package Java;

import java.util.Scanner;
public class Reverse_digit {

    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while(t-->0)
        {
            int d=scanner.nextInt();
            int num=0;
            for(int i=0;i<d;i++)
            {
                int k=scanner.nextInt();
                num=num*10+k;
                if(i==d-1)
                {
                    num++;
                }
            }
            System.out.print(num);
            System.out.println();
        }
    }

}
