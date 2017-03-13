package linkedlist;

public class StackList {
	Node top;
	Node end;
	int size;
	
	StackList(int s){
		top = null;
		end = null;
		size = s;
	}
	void push (int x){
		Node newNode = new Node(x);
		if(top == null){
			top = newNode;
			end = newNode;
			++size;
		}else{
			newNode.nextNode = top;
			top = newNode;
			++size;
		}
	}
	 
	private Node pop(){
		--size;
		Node newTop = top.nextNode;
		Node oldTop = top;
		top = newTop;
		return oldTop;	
	}
	 
	public void printList(){
		Node current = top;

		while(current != null){
			System.out.print(current.getData() + " -> ");
			current = current.nextNode;
		}
		System.out.println("null");
	}
	public static void main(String[] args) {
		StackList sl = new StackList(5);
		sl.push(11);
		sl.printList();
		sl.push(12);
		sl.printList();
		sl.push(13);
		sl.printList();
		System.out.println("pop'd: " + sl.pop());
		sl.printList();
	}

}
