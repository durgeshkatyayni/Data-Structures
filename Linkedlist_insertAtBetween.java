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
	
	public void insertAtBetween(int data, int index)
	{
		Node p=head;
		Node n=new Node(data);
		int i=0;
		while(i!=index-1)
		{
			p=p.next;
			i++;
		}
	//	n.data=data;
		n.next=p.next;
		p.next=n;
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
		
		llist.insertAtBetween(4,1);
		
		llist.printlist();
		
		llist.insertAtBetween(14,2);
		
		llist.printlist();
		
		llist.insertAtBetween(22,4);
		
		llist.printlist();
	}
}