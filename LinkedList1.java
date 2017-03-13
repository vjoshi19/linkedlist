package linkedlist;

public class LinkedList1 {
	Node1 head;
	//Node1 tail;
	
	Node1 InsertNth(Node1 head, int data, int position){
		//System.out.println("func: " + head.data);
		int index = 0;
		Node1 n = new Node1();
		n.data = data;
		
		if(head == null){
			return n;
		}
		if(position == 0 ){
			n.next = head;
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
}
