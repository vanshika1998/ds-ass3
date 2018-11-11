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
	
	public void swapd(int x,int y)
{
if(x==y)
{
return;
}
node prevx=null,currx=head;
node prevy=null,curry=head;
while (currx != null && currx.data != x) 
        { 
            prevx = currx; 
            currx = currx.next; 
        } 
while (curry != null && curry.data != y) 
        { 
            prevy = curry; 
            curry = curry.next; 
        } 
 if (currx== null || curry == null) 
            return; 
if (prevx != null) 
            prevx.next = curry; 
else
            head = curry; 
 if (prevy != null) 
            prevy.next = currx; 
        else  
            head = currx;  
        node temp = currx.next; 
        currx.next = curry.next; 
        curry.next = temp; 
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
class ques1
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
int x=s.nextInt();
int y=s.nextInt();
		p.swapd(x,y);
		p.printlist(h);
		
	}
}