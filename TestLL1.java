package linkedlist;

public class TestLL1 {

	public static void main(String[] args) {
		LinkedList1 ll1 = new LinkedList1();
		LinkedList1 ll2 = new LinkedList1();
		Node1 head1 = new Node1();
		Node1 head2 = new Node1();
		
		head1 = ll1.addAtStart(7);
		head1 = ll1.addAtStart(9);
		ll1.printList(head1);
		head2 = ll2.addAtStart(7);
		ll2.printList(head2);
		System.out.println(ll1.CompareLists(head1, head2));
		//System.out.println("Deleting null head");
		//newHead = ll1.Delete(head, 0);
		//System.out.println("data:" + deleted.data);
		//System.out.println("data:" + deleted.next);
		/*ll1.printList(newHead);
		
		newHead = ll1.InsertNth(newHead, 5, 1);
		ll1.printList(newHead);
		System.out.println("Deleting item at pos 1 ");
		newHead = ll1.Delete(newHead, 1);
		ll1.printList(newHead);
		newHead = ll1.InsertNth(newHead, 4, 2);
		ll1.printList(newHead);
		newHead = ll1.InsertNth(newHead, 2, 3);
		ll1.printList(newHead);
		newHead = ll1.InsertNth(newHead, 10, 1);
		ll1.printList(newHead);
		
		ll1.printReverse(newHead);*/
		/*System.out.println("Deleting item at pos 3 ");
		newHead = ll1.Delete(newHead, 3);
		ll1.printList(newHead);
		System.out.println("Deleting item at pos 0 ");
		newHead = ll1.Delete(newHead, 0);
		ll1.printList(newHead);*/
	}

}
