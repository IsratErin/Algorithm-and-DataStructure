import java.util.NoSuchElementException;



public class Queue {
	public class Node {

        private int value;
        private Node nxt;

        public Node(int value) {
            this.value = value;
        }
    }
    //private Node head;
    private Node first;
    private Node last;

    public Queue(){
        first = null;
        last = null;
    }

    public void add(Integer item){
        Node node = new Node(item);
        if (last == null) {
            first = last = node;
             //head = node;
        }
        else {
            last.nxt = node;
            last = node;
            //head.nxt =node;
            //head = node;
        }
    }
    public Integer remove() {
    	 if (isEmpty()){
             throw new NoSuchElementException();
         }
		//if(first != null) {
			int val = first.value;
			first = first.nxt;
			return val;
			
		
	}

	
    public Integer firstElement1() {
		if(first == null) {
			//System.out.println("Queue is Empty");
			return null;
		}
		else {
			return first.value;
		}
	}
    public Integer peek(){
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return first.value;
    }

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		 return first == null;
	}

}
