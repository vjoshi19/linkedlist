package linkedlist;

public class LinkedList1 {
	Node1 head;
	//Node1 tail;
	
	
	int CompareLists(Node1 headA, Node1 headB) {
	    if (headA == null && headB == null) {
	        return 1;
	    }
	    if (headA == null || headB == null || headA.data != headB.data) {
	        return 0;
	    }
	    return CompareLists(headA.next, headB.next);
	}
	
	Node1 Delete(Node1 head, int position){
		// Empty list 
		if(head == null){
			return null;
		}
		// List with just 1 element
		if(head.next == null && position == 0){
			//System.out.println("Head.next->null");
			head = null;
			return head;
		}
		
		if(head.next != null && position == 0){
			head = head.next;
			return head;
		}
		// Last item on the list
		
		// List with more than 1 element
		Node1 temp = head;
		Node1 previous = head;
		//System.out.println("Previous: " + previous.data);
		int index = 0;
		while(index != position){
			if(index >= 1){
				previous = temp;
				//System.out.println("Previous: " + previous.data);
			}
			
			temp = temp.next;
			//System.out.println("Data: " + temp.data);
			++index;
		}
		//System.out.println("Index: " + index + " position: " + position);
		
		if(temp.next == null){
			//System.out.println("temp.next is null");
			previous.next = null;
		}else{
			previous.next = temp.next;
		}
		
		temp = null;
		return head;	
	}
	Node1 InsertNth(Node1 head, int data, int position){
		//System.out.println("func: " + head.data);
		int index = 0;
		Node1 n = new Node1();
		n.data = data;
		
		if(head == null){
			System.out.println("Head was null");
			return n;
		}
		if(position == 0 ){
			System.out.println("Inserting 0th position");
			//n.next = head;
			head = n;
			//head.data = n.data;
			//head.next = null;
			return head;
		}else{
			//System.out.println("list has: " + temp.data);
			Node1 temp = head;
			while(index < position - 1){
				if(temp.next == null){
					break;
				}
				temp = temp.next;
				++index;
			}
			n.next = temp.next;
			temp.next = n;
			return head;
		}
	}
	public void printList(Node1 head){
		Node1 current = head;
		//System.out.println(head.data);
		while(current != null){
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println("null");
	}
	
	public void printReverse(Node1 head){
		if (head == null){
			return;
		}
		printReverse(head.next);
		System.out.println(head.data);
	}
	
	public Node1 addAtStart (int data){
		// Scenario 1: Empty linked list
		Node1 newnode = new Node1();
		newnode.data = data;
		
		if(head == null){
			head = newnode;
			System.out.println("Added new Node: " + head.data);
		}else{
			// Scenario 2: Non empty linked list: add Node(10) to [Node(13), Node(7)]
			newnode.next = head;
			head = newnode;
			System.out.println("Added new Node: " + head.data);
		}
		return head;
	}
}
