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
			System.out.print(n.data+"  ");
			n=n.next;
		}
		System.out.println();
	}
	
	// insertAtEnd function
	
	public void insertAtEnd(int data)
	{
		Node p=head;
		Node n=new Node(data);
		
		while(p.next != null)
		{
			p=p.next;
		}
		
		p.next=n;
		n.next=null;
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
		
		llist.insertAtEnd(10);
		llist.printlist();
		
		llist.insertAtEnd(20);
		llist.printlist();
		
		llist.insertAtEnd(30);
		llist.printlist();
	
	}
}