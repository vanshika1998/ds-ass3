import java.util.Scanner;
class node
{
	int data;
	node next;
	node head=null;
	public node(int data)
	{
		this.data=data;
		this.next=null;
	}
public void dupl(node head)
{
node temp=head;
if(head==null)
{
return;
}
while(temp.next!=null)
{
if(temp.data==temp.next.data)
{
node next=temp.next.next;
temp.next=null;
temp.next=next;
}
else
{
temp=temp.next;
}
}
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
	
	
	
	
	public void printlist(node head)
	{
		node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+ " ");
			temp=temp.next;
		}
	}

}
class ques2
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		node p=new node(-1);
		node h=null;
		int n=s.nextInt();
		int data=0;
		for(int i=0;i<n;i++)
		{
			data=s.nextInt();
			h=p.add(data);
		}
		p.dupl(h);
		p.printlist(h);
		
	}
}