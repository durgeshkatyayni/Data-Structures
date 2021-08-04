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
	
	// deleteing the first node function
	
	public void deleteFirstNode()
	{
		Node p=head;
		head=p.next;
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
		
		llist.deleteFirstNode();
		llist.printlist();
		
		llist.deleteFirstNode();
		llist.printlist();
	}
}