public class Linkedlist{
	Node head;
	static class Node
	{
		String data;
		Node next;
		
		Node(String d)
		{
			data=d;
			next=null;
		}
	}
	
	// insertAtBegining function
	
	public void insertAtBegining(String data)
	{
		Node n=new Node(data);
		n.next=head;
		head=n;
	}
	
// printList function

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
	
	// main driver function
	public static void main(String[] args)
	{
		Linkedlist llist=new Linkedlist();
		
		llist.head=new Node("Durgesh");
		Node second = new Node("Shivraj");
		Node third = new Node("Naveen");
		
		llist.head.next=second;
		second.next=third;
		
		// calling the traversal function 
		
		llist.printlist();
		
		llist.insertAtBegining("Bamshankar");
		
		llist.printlist();
		
		llist.insertAtBegining("Gaurishankar");
		
		llist.printlist();
	}
}