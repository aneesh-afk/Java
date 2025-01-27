package Java;
import java.util.Scanner;

class Node
{
    public int value;
    public Node next;

    public Node(int val)
    {
        value=val;
        next=null;
    }
}

class Linkedlist
{
    public Node head;

    public void insertfirst(int value)
    {
        System.out.println("Inserting "+value+" at the beginning");
        Node newnode=new Node(value);
        newnode.next=head;
        head=newnode;
    }

    public int getheadvalue()
    {
        if(head==null)
        {
            return -1;
        }
        else
        {
            return head.value;
        }
    }

    public void print()
    {
        Node current=head;
        while(current!=null)
        {
            System.out.print(current.value + " ");
            current=current.next;
        }
    }
}

public class Linkedlist_insertbeg 
{
    public static void main(String[] args)
    {
    Linkedlist list=new Linkedlist();
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the number of elements");
    int t=scanner.nextInt();
    while(t-->0)
    {
        int n=scanner.nextInt();
        list.insertfirst(n);
        System.out.println("The head of the list is "+list.getheadvalue());
    }
    System.out.println("The final list is ");
    list.print();
}

    
}
