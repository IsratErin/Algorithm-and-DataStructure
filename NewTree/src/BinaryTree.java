import java.util.Iterator;
import java.util.Stack;

public class BinaryTree implements Iterable<Integer> {
		public class Node {
			
			public Integer key;
			public Integer value;
			public Node left, right;
			
			
			public Node(Integer key, Integer value) {
			this.key = key;
			this.value = value;
			this.left = this.right = null;
			}
		}
		Node root;
		public BinaryTree() {
		root = null;
		}
		public Integer root() {
			return this.root.key;
		}
		public Integer lookup(Integer key){
	        Node current = root;

	        while(current != null){

	            if(key < current.key){
	                current = current.left;
	            }
	            else if(key > current.key){
	                current = current.right;
	            }
	            else
	                return current.value;
	        }
	        return null;
	    }
		public void add(Integer key, Integer value) {  
	          //Create a new node  
	          Node node = new Node(key, value);  
	  
	          //Check whether tree is empty  
	          if(root == null){  
	              root = node;  
	              return;  
	            }  
	          else
	          { 
	        	  
	              //current node point to root of the tree  
	              Node current = root;
	              Node parent = null;  
	              while(true) {  
	                  //parent keep track of the parent node of current node.  
	                  parent = current;  
	        
	     //If key is less than current's key, node will be inserted to the left of tree  
	                  if(key < current.key) {  
	                      current = current.left;  
	                      if(current == null) {  
	                          parent.left = node;  
	                          return;  
	                      }  
	                  }  
	     //If key is greater than current's key, node will be inserted to the right of tree  
	                  else {  
	                      current = current.right;  
	                      if(current == null) {  
	                          parent.right = node;  
	                          return;  
	                      }  
	                  }  
	              }  
	          }  
	      }  
		 
			
		public Iterator<Integer> iterator() {
			
		return new TreeIterator();
		
		}
		
	public class TreeIterator implements Iterator<Integer> {
		private Node next;
		private Stack<Node> stack;
		public TreeIterator() {		
			this.stack = new Stack<Node>();
			next = root;
			while(root != null) {
				stack.push(root);
				root = root.left;	
			}	
		}
		@Override
		public boolean hasNext() {
			return this.stack.size() != 0 ;
			//return !stack.isEmpty();
		}
		@Override
		public Integer next() {
			
			
			//Node curr = stack.peek();
	        //Node next= curr;
			Node current = stack.peek();
			Node next = current;
	        if(next.right == null){
	            next = stack.pop();
	            while(!stack.isEmpty() && stack.peek().right == next){
	                next = stack.pop();
	            }
	            
	        } else{
	            next = next.right;
	            while(next != null){
	                stack.push(next);
	                next = next.left;
	            }
	        }
	        
	        return current.key;
		}
	
		@Override
		public void remove() {
		throw new UnsupportedOperationException();
		}
	}

}

