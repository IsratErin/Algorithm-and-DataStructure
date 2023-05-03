

public class LinkedList {
	
	Node head;
	private int size;
	//private Node first;
	
	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if(head == null) {
			head = node;
		}
		else {
			Node n = head;
			while(n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
		size++;
		
	}
	public int getsize() {
		return size;
	}
	public void print() {
		Node node = head;
		while(node.next!= null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
	
	public int[] toArray() {
		int[] array = new int[size];
		Node node = head;
		int index = 0;
		while (node != null) {
			array[index]= node.data;
			index++;
			node = node.next;
				
		}
		return array;
	}
	
	public void append(LinkedList a) {
		Node node = a.head;
		for (int i = 0; i < a.getsize(); i++) {
		while(node.next != null ) {
			node = node.next;
		}
		size++;
		}
		node.next= a.head;	
	}
	public void append1(LinkedList a) {
		Node node = a.head;
		for (int i = 0; i < a.getsize(); i++) {
		head.next= node;
		head = node;
		size++;
		}
	}
	
	
	/*public void append(LinkedList a) {
		Node node1 = head;
		Node node = a.head;
		for (int i = 0; i < a.getsize(); i++) {
			
		while(node1.next != null ) {
			node1 = node1.next;
		}
		size++;
		}
		node1.next= node.data;
	
		
	}*/
	
	 

}
