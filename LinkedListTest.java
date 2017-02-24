package linkedlist;

import org.junit.Test;

public class LinkedListTest {
	@Test
	public void test(){
		myLinkedList list = new myLinkedList();
		
		list.add(15);
		list.add(16);
		list.add(10);
		
		System.out.println("Does 10 exist in list? " + list.find(10));
		System.out.println("Does 15 exist in list? " + list.find(15));
		System.out.println("Does 16 exist in list? " + list.find(16));
		//System.out.println("Does 20 exist in list? " + list.find(20));
		//System.out.println("Does 1 exist in list? " + list.find(1));
		
		System.out.println("Deleteing 16 from the list");
		list.delete(16);
		System.out.println("Does 16 exist in list? " + list.find(16));
	}

}
