

public class LinkedList {
	  /*LinkedList tail;
	    int head;*/

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

	    public void append(LinkedList list) {
	        Node node = new Node(list.first.value);
	        //Node node = new Node(list.last.value);

	       for (int i = 0; i < list.size(); i++) {
	                last.nxt = node;
	                node = list.first;
	                size ++;
	         
	        }
	    }
	    public void append1(LinkedList a) {
			Node node = first;
			for (int i = 0; i < a.size(); i++) {
			while(node.nxt != null ) {
				node = node.nxt;
			}
			size++;
			}
			node.nxt= a.first;	
		}
	    
	     /*public void append_last(LinkedList b) {
	            LinkedList nxt = this;
	            while (nxt.tail != null) {
	                nxt = nxt.tail;
	            }
	            nxt.tail = b;

	        }*/

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
	        public void remove(Node node) {
	        	if(node == null || first== null)
		   		{
	        		
		   			return;
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
	        public void addback(Node node) {
	        	/*if(first == null) {
            		first=last= node;
            	}*/
	        	
	        	/*Node current = first;
	        	first = node;
	        	first.nxt = current;*/
	        	 if(first == node) {
		        		return;
		        	}
	        	if(first != node )
	        	{
	        		Node current = first;
	        		//while(current.nxt != null) {
	        		while(current != null) {
	        			current =current.nxt;
	        			if(current == node) {
	        				return;
	        			}
	        		}	
	        		
	        	}
	        	//if(first!= node ) {
	        		//Node current1 = first;
	        		//first = node;
	        		node.nxt = first;
	        		first = node;
		        	
		        	size++;
	        	
	        }
	        
	        //try
            public void addback1(Node node) {
	        	
	        	/*Node current = first;
	        	first = node;
	        	first.nxt = current;*/
            	if(first == null) {
            		first=last= node;
            	}
	        	 if(first == node) {
		        		return;
		        	}
	        	
	        	//if(first!= node ) {
	        		Node current1 = first;
	        		first = node;
	        		first.nxt = current1;
		        	
		        	size++;
	        	
	        }
            public void remove1(Node node) {
	        	if(node == null || first== null)
		   		{
	        		
		   			return;
		   		}
	        	
	        	
		   		 // if it is the first node in the list
		   		 if(node == first) {
		   			 first = node.nxt;	 
		   		 }
		   		 // if it is the last node in the list
		   		 else if (node == last)
		   		 {  
		   			 
		   			 Node current = first;
		   			
		   			 while(current.nxt != last) {
		   				 current = current.nxt;
		   			 }
		   			 last = current;
		   			 last.nxt = null;
		   					 	 
		   		 }
		   		 else {
		   			Node current = first;
		   			
		   			 //while(current.nxt != node) {
		   			while(current.nxt != node) {
		   				 current = current.nxt;
		  
		   			 }
		   			 current.nxt = node.nxt;
		   		 }
		   		 
		   		 size--;
	        }
	        
	        
}
