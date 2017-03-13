package linkedlist;

public class myLinkedList {
	// head                        tail
	//   ||                          ||
	// Node(data) -> Node(data) -> Node(data)
	// Add Node
	// Delete Node
	// Find
	
	Node head;
	Node tail;
	
	public void add (int data){
		// Scenario 1: Empty linked list
		Node newnode = new Node(data);
		
		if(tail == null){
			head = newnode;
			tail = newnode;
		}else{
			// Scenario 2: Non empty linked list: add Node(10) to [Node(13), Node(7)]
			tail.nextNode = newnode; 
			tail = newnode;
		}
	}
	
	Node InsertNth(Node head, int data, int position){
		Node temp = head;
		int index = 0;
		Node n = new Node(data);
		
		if(head == null){
			head = n;
			head.nextNode = null;
			return head;
		}
		
		while(index <= position){
			temp = temp.nextNode;
			++index;
		}
		n.nextNode = temp.nextNode;
		temp.nextNode = n;
		return head;
	}
	
	public Node addAtStart(Node head, int data){
		Node n = new Node(data);
		if(head == null){
			head = n;
			head.nextNode = null;
		}else{
			n.nextNode = head;
		    head = n;
		}
		return head;
	}
	
	public void printList(){
		Node current = head;
		
		while(current != null){
			System.out.print(current.getData() + " -> ");
			current = current.nextNode;
		}
		System.out.println("null");
	}
	
	public Boolean delete(int data){
		Node previous = head;
		Node current = head;
		// blank list
		if (head == null){
			return null;
		}
		// check the first element for a match
		if(head.data == data){
			return true;
		}
		while (current.nextNode != null){
			if (current.data != data){
				previous = current;
				current = current.nextNode;
			}else{
				previous.nextNode = current.nextNode;
				return true;
			}
		}
		return false;
	}
	
	public Node find (int data){
		// Scn 1: empty linked list
		// Scn 2: non-empty linked list
		if (head == null){
			return null;
		}
		// check the first element for a match
		if(head.data == data){
			return head;
		}
		
		Node node = head;
		
		while(head.nextNode != null){
			node = node.nextNode;
			if (node.data == data){
				return node;
			}
		}
		return null;
	}
}
