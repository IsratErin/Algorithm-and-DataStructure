
public class BinaryTree {
	public class Node {
		
		public Integer key;
		public Integer value;
		public Node left, right;
		
		
		public Node(Integer key, Integer value) {
		this.key = key;
		this.value = value;
		this.left = this.right = null;
		}
		public void print() {
			if(left != null)
			left.print();
			System.out.println(" key: " + key + "\tvalue: " + value);
			if(right != null)
			right.print();
			}
    }
		Node root;
		public BinaryTree() {
		root = null;
		}
		
		
		public void inOrderTraverseTree(Node focusNode) {
			if (focusNode != null) {
				
				// Traverse the left node
				inOrderTraverseTree(focusNode.left);
				System.out.println("key:" + focusNode.key);
				inOrderTraverseTree(focusNode.right);
				//System.out.println("the root" + root.key);
			}
			

		}
		public Integer root() {
			return this.root.key;
		}
		public void inorderTraversal(Node node) {  
			  
	          //Check whether tree is empty  
	          if(root == null){  
	              System.out.println("Tree is empty");  
	              return;  
	           }  
	          else {  
	        	 
	              if(node.left!= null)  
	                  inorderTraversal(node.left);  
	              System.out.print(node.key + " ");  
	              if(node.right!= null)  
	                  inorderTraversal(node.right);  
	              
	          }  
	          
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
		public Integer lookup2(Integer key){
			while(root != null && root.key != key) {
				root = key < root.key ? root.left:root.right;
				
			}
			if(root == null) {
				return null;
			}
			return root.value;
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
		 
		 
	

}
