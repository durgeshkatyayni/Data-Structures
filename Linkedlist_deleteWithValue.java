public class Linkedlist{
	Node head;
	static class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			data=d;
			next=null;
		}
	}

	public void printlist()
	{
		Node n=head;
		while(n!=null)
		{
			System.out.print(n.data+", ");
			n=n.next;
		}
		System.out.println();
	}
	
	// function for deleteing the last node
	
	public void deleteWithValue(int value)
	{
		Node p=head;
		Node q=head.next;
		while(q.data != value && q.next != null)
		{
			p=p.next;
			q=q.next;
		}
		if(q.data == value)
		{
			p.next=q.next;
		}
		else
		{
			System.out.println("Value not Matched ... ");
		}
	}
	
	
	// main driver function
	public static void main(String[] args)
	{
		Linkedlist llist=new Linkedlist();
		
		llist.head=new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		llist.head.next=second;
		second.next=third;
		
		// calling the traversal function 
		
		llist.printlist();
		
		llist.deleteWithValue(2);
		llist.printlist();
		
		llist.deleteWithValue(12);
		llist.printlist();
	}
}