import java.util.Iterator;



public class BinaryTree implements Iterable<Integer> {
	static class Node {
        Integer key;
        Node left, right;
 
        // constructor
        Node(int key)
        {
            this.key = key;
            left = null;
            right = null;
        }
    }
    static Node root;
    static Node temp = root;
    public void add(Integer key)
    {
 
        if (temp == null) {
            root = new Node(key);
            return;
        }
        Queue q = new Queue();
        q.add(temp.key);
 
        // Do level order traversal until we find
        // an empty place.
        while (!q.isEmpty()) {
            
			temp.key =  q.peek();
            q.remove();
 
            if (temp.left == null) {
                temp.left = new Node(key);
                break;
            }
            else
                q.add(temp.left.key);
 
            if (temp.right == null) {
                temp.right = new Node(key);
                break;
            }
            else
                q.add(temp.right.key);
        }


}
    public Iterator<Integer> iterator() {
		
    	return new TreeIterator();
    	
    	}
    	
    public class TreeIterator implements Iterator<Integer> {
    	private Node next;
    	Queue q;
    	public TreeIterator() {		
    		//this.q = new Queue();
    		 q = new Queue();
    		if(root != null) {
    		q.add(root.key);
    		}
            
            
    	}
    	@Override
    	public boolean hasNext() {
    		
    		return !q.isEmpty();
    	}
    	@Override
    	public Integer next() {
    		
    		Integer node = null;
    		
    		//if(next.left != null && next.right != null) {
    		if(!q.isEmpty()) {
    		if(next.left != null)  {
    			q.add(next.left.key);
    		}
    		if( next.right != null) {
    			q.add(next.right.key);	
    			
    		}
    		node= q.remove();
    		}
    			
    		return node;
    	
    	}

    	@Override
    	public void remove() {
    	throw new UnsupportedOperationException();
    	}
    }
}
