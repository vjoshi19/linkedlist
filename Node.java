package linkedlist;

public class Node {

	int data;
	Node nextNode;
	
	//Constructor this sets it to data and next node to null.
	public Node(int data) {
		this.data = data;
	}
	
	public String toString(){
		return "" + data;
	}
	
	public int getData(){
		return data;
	}
	
	public void setData(int d){
		data = d;
	}
	
	public void setNode(Node n){
		nextNode = n.nextNode;
	}
	
}
