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
	
	// function for deletegivenindex
	
	public void deleteGivenIndex(int index)
	{
		Node p=head;
		Node q=head.next;
		int i=0;
		
		while(i!=index-1)
		{
			p=p.next;
			q=q.next;
			i++;
		}
		p.next=q.next;
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
		
		llist.deleteGivenIndex(2);
		llist.printlist();
		
		llist.deleteGivenIndex(1);
		llist.printlist();
	}
}