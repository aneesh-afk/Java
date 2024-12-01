package Java;
import java.util.ArrayList;
import java.util.Scanner;

public class Increment_arraylist {
    public static void main(String args[])
    {
    ArrayList<Integer> values=new ArrayList<Integer>();
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter number of elements");
    int n=scanner.nextInt();
    System.out.println("Enter digits");
    for(int i=0;i<n;i++)
    {
        int a=scanner.nextInt();
        values.add(a);
    }
    ArrayList<Integer> result=increment(values);
    System.out.println(result);
}
public static ArrayList<Integer> increment(ArrayList<Integer> values)
{
    int c=1;
    int n=values.size();
    for(int i=n-1;i>=0;i--)
    {
        int sum=0;
        sum=values.get(i)+c;
        values.set(i,sum%10);
        c=sum/10;
    }
    if(c>0)
    {
        values.add(0,c);
    }
    while(values.size()>1 && values.get(0)==0)
    {
        values.remove(0);
    }
    return values;
    }
}
