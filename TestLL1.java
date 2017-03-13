package linkedlist;

public class TestLL1 {

	public static void main(String[] args) {
		LinkedList1 ll1 = new LinkedList1();
		Node1 head = new Node1();
		Node1 newHead = ll1.InsertNth(head, 3, 0);
		ll1.printList(newHead);
		
		newHead = ll1.InsertNth(newHead, 5, 1);
		ll1.printList(newHead);
		newHead = ll1.InsertNth(newHead, 4, 2);
		ll1.printList(newHead);
		newHead = ll1.InsertNth(newHead, 2, 3);
		ll1.printList(newHead);
		newHead = ll1.InsertNth(newHead, 10, 1);
		ll1.printList(newHead);
	}

}
