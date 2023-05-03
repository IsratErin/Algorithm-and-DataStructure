

public class LinkedList {
	public class Node {

        private int value;
        private Node nxt;

        public Node(int value) {
            this.value = value;
        }
    }

        /*public int head() {
        return this.head;
       }

        public LinkedList tail() {
          return this.tail;
        }*/

        private Node first;
        private Node last;
        private int size;

    public Node insert(int item) {
        Node node = new Node(item);
        if (last == null) {
            first = last = node;
        }
        else {
            last.nxt = node;
            last = node;
        }
        size++;
        return node;
        
    }

   

        public int size(){
        return size;
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
        	
        	if(first == null) {
        		first=last= node;
        	}
    	
    		node.nxt = first;
    		first = node;
        	
        	 
	        	size++;
	        return node;
        	
        }
        public Node addback1(Node node) {
	         if(first == null) {
	                   first=last= node;
	          }
	         else {
	        	 Node current = first;
	        	 while(current.nxt != null) {
	   				 current = current.nxt;
	   			 }
	        	 
	        	 current.nxt = node;
	        	 node.nxt = null;
	        	 last = node;
	         }
	   	      size++;
	          return node;
        	
        }
        public void remove(Node node) {
        	if(node == null || first== null)
	   		{
        		
	   			return ;
	   		}
        	
        	
	   		 // if it is the first node in the list
	   		 if(node == first) {
	   			 first = node.nxt;	 
	   		 }
	   		 // if it is the last node in the list
	   		 else if (node == last)
	   		 {  
	   			 
	   			 Node current = first;
	   			
	   			 while(current.nxt != node) {
	   				 current = current.nxt;
	   			 }
	   			 last = current;
	   			 current.nxt = null;
	   					 	 
	   		 }
	   		 else {
	   			Node current = first;
	   			
	   			 //while(current.nxt != node) {
	   			while(current.nxt != node) {
	   				 current = current.nxt;
	   				if(current == null) {
		   				return;
		   			}
	   			 }
	   			 current.nxt = node.nxt;
	   		 }
	   		 
	   		 size--;
        }
        
        public void remove1(Node node) {
        	if(first == null) return;
            
            // check head's data if equal
            // and assign next node as head
            if(first == node){
                first = first.nxt;
                //return;
            }
            
            // get head reference
            Node current = first;
            
            // iterate list
            while(current.nxt != null){
                
                // check next node's data
                // skip next node
                if(current.nxt == node){
                    current.nxt = current.nxt.nxt;
                    return;
                }
                
                // go to next node
                current = current.nxt;
            }
        	  size--;
        }
        public void remove2(Node node) {
        	if(first == null) {
        		return;
        	}
        	if(node == first) {
        		first = first.nxt;
        	}
        	else {
        		Node current = first;
        		
        			while(current.nxt!= node) {
        				current =current.nxt;
        			if (current == null) {
        				return;
        			}
        			
        		}
        		current.nxt = node.nxt;
        	}
        	size--;
        }
        
       
        
        

}
