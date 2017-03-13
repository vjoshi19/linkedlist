package linkedlist;

public class SinglyLinkedList {

	public static void main(String[] args) {
		//Node aNode = new Node(1);
		myLinkedList list = new myLinkedList();
		
		/*System.out.println("Testing setters and getters");
		System.out.println("Data in Node: " + aNode.getData());
		System.out.println(aNode.nextNode);*/
		System.out.println("List App:");
		System.out.println("What do you want to do: ");
		
		System.out.println("Adding to a list");

		//System.out.print(list.addAtStart(head, 5).data);
		list.printList();
		list.add(10);
		list.printList();
		list.add(11);
		list.printList();
		list.add(14);
		list.printList();
		list.add(24);
		list.printList();
		list.add(43);
		list.printList();
		
		System.out.println("\n\nFinding an element in the list");
		System.out.println("Is 10 in the list " + list.find(10));
		try{
			System.out.println("Is 113 in the list " + list.find(113));
		} catch(NullPointerException np){
			System.out.println("Finding a non existent item in the list!!");
		}
		System.out.println("Is 11 in the list " + list.find(11));
		
		System.out.println("Deleting an item from the list");
		list.printList();
		System.out.println("Was 24 deleted : " + list.delete(24));
		list.printList();
		
		System.out.println("Was 124 deleted : " + list.delete(124));
		list.printList();
	}

}
