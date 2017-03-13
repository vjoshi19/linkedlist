package linkedlist;

public class SinglyLinkedCircularList {

	Node first;
	Node last;
	int size;
	
	public SinglyLinkedCircularList(){
		first = null;
		last = null;
		size = 0;
	}
	
	public Boolean isEmpty(){
		return first == null;
	}
	
	public int getSize(){
		return size;
	}
	
	/*public Node addAtStart(int d){
		Node n = new Node(d);
		if(first == null){
			add(d);
		}
	}*/
	
	public Node add(int d){
		Node n = new Node(d);
		if(first == null){
			first = n;
			last = n;
			n.nextNode = first;
			++size;
		}else if(size == 1) {
			System.out.println("add->first" + first.data);
			first.nextNode = n;
			n.nextNode = first;
			last= n;
			System.out.println("add->last" + last.data);
			++size;
		}else if (size > 1){
			last.nextNode = n;
			n.nextNode = first;
			first = n;
			++size;
		}
		return n;
	}
	
	public Node addAtEnd(int d){
		Node n = new Node(d);
		if(last == null){
			add(d);
			
		}else{
			last.nextNode = n;
			n.nextNode = first;
			last = n;
			++size;
		}
		return n;
	}
	
	public Node insert(Node n, int d){
		Node temp = first;
		System.out.println("insert()Node to search:" + n.data);
		System.out.println("insert()data to add: "+ d);
		while(temp.data != n.data){
			System.out.println("insert():"+temp.data);
			temp = temp.nextNode;
		}
		System.out.println("Found:" + temp.data);
		Node newNode = new Node(d);
		Node nextTemp = temp.nextNode;
		temp.nextNode = newNode;
		newNode.nextNode = nextTemp;
		size++;
		return n;
	}
	
	public Node deleteAfter(Node x){
		Node delNode = x.nextNode;
		Node next2del = delNode.nextNode;
		
		x.nextNode = next2del;
		--size;
		return delNode;
	}
	
	public void printList(){
		Node current = first;
		do{
			System.out.print(current.data + " ");
			current = current.nextNode;
			//System.out.print(current.data + " ");
		}while(current!= first);
		System.out.println();
		System.out.println("Num of elements = " + this.getSize());
	}
	
	public static void main(String[] args) {
		System.out.println("Circular singly linked list");
		SinglyLinkedCircularList sl = new SinglyLinkedCircularList();
		
		sl.add(1);
		sl.printList();
		Node x = sl.add(2);
		sl.printList();
		sl.add(3);
		sl.printList();
		sl.add(7);
		sl.printList();
		sl.addAtEnd(9);
		sl.printList();
		sl.addAtEnd(11);
		sl.printList();
		System.out.println("Inserting after " + x.data);
		sl.insert(x, 14);
		sl.printList();
		sl.deleteAfter(x);
		sl.printList();

		
	}

}
