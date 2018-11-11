
import java.util.Scanner;
class node
{
	int data;
	node next;
	node head=null;
	node prev;
	public node(int data)
	{
		this.data=data;
		this.next=null;
		this.prev=null;
	}
	public node add(int data)
	{
		node l=new node(data);
		l.next=null;
		if(head==null)
		{
			l.prev=null;
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
			l.prev=temp;
		}
		return head;
	}
	boolean palin(node head)
	{
		if(head==null)
		{
			return true;
		}
		node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		while(head!=temp)
		{
			if(head.data!=temp.data)
			{
				return false;
			}
			head=head.next;
			temp=temp.prev;
		}
		return true;
	}
	public void printlist(node head)
	{
		node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" " );
			head=temp;
			temp=temp.next;

		}
		while (head!=null)                       
		{
			System.out.print(head.data+" ");
			//head=temp;
			head=head.prev;

		}

	}

}
class ques4
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int data=0;
		node p=new node(data);
		node h=null;
		for(int i=0;i<n;i++)
					{
			data=s.nextInt();
            h=p.add(data);
		}
		
		//p.printlist(g);

		if(p.palin(h)!=false)
		{
			System.out.println("palindrome");

		}
		else
		{
			System.out.println("not aplindrome");
		}

	}
}