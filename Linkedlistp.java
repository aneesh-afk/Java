import java.util.Scanner;

public class Linkedlistp {
    public static void main(String[] args)
{
Linkedlist list=new Linkedlist();
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of elements in the list");
int t=sc.nextInt();
System.out.println("Enter the elements");
while(t-->0)
{
int n=sc.nextInt();
list.insert(n);
}
System.out.println("Enter number of changes to be made");
int c=sc.nextInt();
while(c-->0)
{
System.out.println("Enter 0 for inserting a element and 1 for deleting a element");
int j=sc.nextInt();
if(j==0)
{
System.out.println("Enter the elements to be inserted and its position");
int a=sc.nextInt();
int p=sc.nextInt();
list.insertk(a,p);
}
else if(j==1)
{
System.out.println("Enter element to be eliminated");
int d=sc.nextInt();
list.delete(d);
}
}
System.out.println("The final list is as follows: ");
list.print();
}
}
    
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
public Node tail;

public void insert(int n)
{
Node newnode=new Node(n);
if(head==null)
{
head=newnode;
tail=newnode;
}
else
{
tail.next=newnode;
tail=newnode;
}
}

public void insertk(int a,int p)
{
Node newnode=new Node(a);
Node inserter=this.head;
for(int i=1;i<p-1;i++)
{
inserter=inserter.next;
}
Node temp=inserter.next;
inserter.next=newnode;
newnode.next=temp;
}


public void delete(int value)
{
Node current=this.head;
if(head.value==value)
{
head=current.next;
return;
}
while(current.next!=null)
{
if(current.next.value==value)
{
current.next=current.next.next;
}
current=current.next;
}
}

public void print()
{
Node temp=this.head;
while(temp!=null)
{
System.out.print(temp.value + " ");
temp=temp.next;
}
}
}