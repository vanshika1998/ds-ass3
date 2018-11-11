
import java.util.Scanner;
class node
{
 
     node head=null;
     int data;
     node next;
     public node(int data1)
     {
       this.data=data1;
       this.next=null;
     }
    
    public node add(int data)
    {
     node l=new node(data);
     if(head==null)
     {
      head=l;
     }
     else
     {
      node temp=head;
       while(temp.next!=null)
       {
         temp=temp.next;
       }
      
      temp.next=l;
      
}
return head;
    }
    public node reverse(node head)
    {
      node prev=null;
      node cur=head;
      node next=null;
      while(cur!=null)
      {
        next=cur.next;
        cur.next=prev;
        prev=cur;
        cur=next;
      }
      head=prev;
      return head;
    }
     public void printlist(node head)
     {
     	node temp=head;
     	while(temp!=null)
     	{
     		System.out.print(temp.data + " ");
        //System.out.println();
     		temp=temp.next;
     	}
     }
}
class ques5
{
	public static void main(String[] args)
	{
		node p=new node(-1);
	node h =	null;
  
	Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int data=0;
		for(int i=0;i<n;i++)
{
data=s.nextInt();
h=p.add(data);
}
		p.printlist(h);
    node r=p.reverse(h);
    System.out.println("my reversed list is :-");
    p.printlist(r);
    
		
	}
}