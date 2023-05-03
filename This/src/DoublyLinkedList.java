

public class DoublyLinkedList {
	public class Node {

        private int value;
        private Node nxt;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }
	}
	
	 private Node first =null;
	 private Node last = null;
	 private int size;
	 

	 public Node insert(int item) {
	        Node node = new Node(item);
	        if (first == null) {
	            first = last = node;
	            first.prev = null;
	            last.nxt = null;
	        }
	        else {
	            last.nxt = node;
	            node.prev = last;
	            last = node;
	            last.nxt = null;
	        }
	        size++;
	        return node;
	       
	    }
	 
	 public void remove(Node node){
		 if(node== null || first== null) {
		 
			 return;
		 }
		 // if it is the first node in the list
		 if(first == node) {
			 first = node.nxt;	 
		 }
		 
		  if (node.nxt != null)
		 {
			 node.nxt.prev = node.prev;
			 
		 }
		  if (node.prev != null){
			 node.prev.nxt = node.nxt;
		 }
		 
		  size--;  
		  
	 }
	 public void remove1(Node node){
		 if(node== null || first== null) {
		 //if(node== null ) {
			 return;
		 }
		 // if it is the first node in the list
		 if(first == node) {
			 first = node.nxt;	 
		 }
		 
		  if (node.nxt != null)
		 {
			 node.nxt.prev = node.prev;
			 
			 
		 }
		  if (node.prev != null){
			 node.prev.nxt = node.nxt;
			 
		 }
		  
		 
		  size--;
		  
		  
	 }
	
	 
	 public int[] toArray(){
	        int[] array = new int[size];
	        Node current = first;
	        int index = 0;
	        while (current != null){
	            array[index] = current.value;
	            index++;
	            current = current.nxt;
	           // index++;
	        }
	        
	        
	        
	        return array;
	    }
	 //try
	 public Node addback(Node node) {
		 if(first== null) {
			 first=last= node;
			 first.prev = null;
			 last.nxt = null;
		 }
			
		 else {
		
 		first.prev = node;
 		node.nxt = first;
 		node.prev = null;
 		first = node;
 		}
		 size++;
		return node;
		
 		
		 
	 }
       

}
