import java.util.*;
public class Linkedlist
{
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
	
	// Deletion function
	
	// deleteFromBeginning
	public void deleteFromBeginning()
	{
		Node p=head;
		head=p.next;
	}
	
	// deletegivenindex
	public void deleteGivenIndex(int index)
	{
		Node p=head;
		Node q=p.next;
		int i=0;
		while(i != index-1)
		{
			p=p.next;
			q=q.next;
			i++;
		}
		p.next=q.next;
	}
	
	// Delete Last Node
	public void deleteLastNode()
	{
		Node p=head;
		Node q=p.next;
		while(q.next != null)
		{
			p=p.next;
			q=q.next;
		}
		p.next=null;
	}
	
	// Delete with value
	public void deleteWithValue(int value)
	{
		Node p=head;
		Node q=p.next;
		while(q.data != value && q.next != null)
		{
			p=p.next;
			q=q.next;
		}
		
		if(q.data == value)
		{
			p.next=q.next;
		}
	}
	
	
	// insertion function
	
	// insertAtBeginning
	
	public void insertAtBegin(int data)
	{
		Node n = new Node(data);
		n.next=head;
		head=n;
	}
	
	// insertAtBetween
	public void insertAtBetween(int data, int index)
	{
		Node p=head;
		Node n=new Node(data);
		int i=0;
		while(i != index-1)
		{
			p=p.next;
			i++;
		}
		n.next=p.next;
		p.next=n;
	}
	
	// insertAfterNode
	public void insertAfterNode(int data, Node prev)
	{
		Node n=new Node(data);
		n.next=prev.next;
		prev.next=n;
	}
	
	// insertAtEnd 
	public void insertAtEnd(int data)
	{
		Node p=head;
		Node n=new Node(data);
		while(p.next != null)
		{
			p=p.next;
		}
		p.next=n;
	}
	
	
	//Traversal function
	public void printlist()
	{
		Node p=head;
		while(p != null)
		{
			System.out.print(p.data+", ");
			p=p.next;
		}
		System.out.println();
	}
	
// searching function

	public void search(int item)
	{
		Node p=head;
		boolean found=false;
		while(p != null)
		{
			if(p.data == item)
			{
				found=true;
				System.out.println("Your search item "+p.data+" is exist : true\n");
			}
			p=p.next;
		}
		
		if(found == false)
		{
			System.out.println("Your search item "+item+" doesn't exist : false\n");
		}
	}	
	
	// Driver code
	public static void main(String[] args)
	{
	try
	{
	Linkedlist ll = new Linkedlist();
	
	ll.head=new Node(1);
	
	// Switch case design
	
	Scanner sc=new Scanner(System.in);
	while(true)
	{
	System.out.print("1. Insert\n2. Delete\n3. Display\n4. Search\n5. Exit\n\nEnter Your Choice : ");
	
	int choice=sc.nextInt();
	switch(choice)
	{
		case 1:
		{
			boolean s=true;
			while(s)
			{
				System.out.print("1. insertAtBeginning\n2. insertAtBetween\n3. insertAfterNode\n4. insertAtEnd\n5. Exit\n\nEnter your choice : ");
				int ch=sc.nextInt();
				switch(ch)
				{
					case 1:
					{
						System.out.print("Enter your data : ");
						int data=sc.nextInt();
						ll.insertAtBegin(data);
						break;
					}
					
					case 2:
					{
						System.out.print("Enter your data : ");
						int data=sc.nextInt();
						System.out.print("Enter your index : ");
						int ind=sc.nextInt();
						ll.insertAtBetween(data, ind);
						break;
					}
					
					case 3:
					{
						//System.out.print("Enter your data : ");
//						int data=sc.nextInt();
//						System.out.print("Enter the Node : ");
//						ll.insertAfterNode(data, nodename);
						System.out.println("Please use rest of these three for insertion ");
						break;
					}
					
					case 4:
					{
						System.out.print("Enter your data : ");
						int data=sc.nextInt();
						ll.insertAtEnd(data);
						break;
					}
					
					case 5:
					{
						s=false;
						break;			
					}
					
					default :
					{
						System.out.println("Choice not matched -----\n");
						break;
					}
				}
			}
			break;
		}
		
		case 2:
		{
			boolean s=true;
			while(s)
			{
				System.out.print("1. deleteFromBeginning\n2. deleteGivenIndex\n3. deleteWithValue\n4. deleteLastNode\n5. Exit\n\nEnter your choice : ");
				int ch=sc.nextInt();
				switch(ch)
				{
					case 1:
					{
						ll.deleteFromBeginning();
						break;
					}
					
					case 2:
					{
						System.out.print("Enter your index : ");
						int ind=sc.nextInt();
						ll.deleteGivenIndex(ind);
						break;
					}
					
					case 3:
					{
						System.out.print("Enter your value : ");
						int data=sc.nextInt();
						ll.deleteWithValue(data);
						break;
					}
					
					case 4:
					{
						ll.deleteLastNode();
						break;
					}
					
					case 5:
					{
						s=false;
						break;			
					}
					
					default :
					{
						System.out.println("Choice not matched -----\n");
						break;
					}
				}
			}
			break;
		}
		
		case 3:
		{
			ll.printlist();
			break;
		}
		
		case 4:
		{
			System.out.print("Enter your data : ");
			int item=sc.nextInt();
			ll.search(item);
			break;
		}
		
		case 5:
		{
			System.exit(1);
			break;
		}
		default :
		{
			System.out.println("Wrong choice ! \nPlease Enter a valid choice\n ");
			break;
		}
	}
	}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
}