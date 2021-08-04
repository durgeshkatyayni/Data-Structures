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
	
	// insertAfterNode function
	
	public void insertAfterNode(Node prev, int data)
	{
		Node n=new Node(data);
		
		n.next=prev.next;
		prev.next=n;
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
		
		llist.insertAfterNode(third, 10);
		llist.printlist();
	}
}