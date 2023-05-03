
public class LinkedList {
	private class Node {

        private int value;
        private Node nxt;

        public Node(int value) {
            this.value = value;
        }
    }
        LinkedList tail;
        int head;

        public int head() {
            return this.head;
        }

        public LinkedList tail() {
            return this.tail;
        }

        private Node first;
        private Node last;
        private int size;

        public void insertlast(LinkedList b){
            LinkedList nxt = this;
            if (nxt.tail != null){
                nxt = nxt.tail;
            }
            nxt.tail = b;
        }

    public void insert(int item) {
        Node node = new Node(item);
        if (last == null) {
            first = last = node;
        }
        else {
            last.nxt = node;
            last = node;
        }
        size++;
    }

    public void append(LinkedList list) {
        Node node = new Node(list.first.value);

        for (int i = 0; i < list.size(); i++) {
            
                last.nxt = node;
                node = list.first;
                size++;
        }
    }
    
    
     
    
    
    public void append2(LinkedList b) {
        LinkedList node = this;
        while (node != null) {
            node = node.tail;
        }
        //last.nxt = b.first;
        node = b;

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
        }
        return array;
    }
	

}
