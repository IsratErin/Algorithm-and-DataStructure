import java.util.Random;

public class Compare {

	public static void build_List(int size){
        LinkedList list = new LinkedList();
        for ( int i = 1; i <= size; i++){
            list.insert(i);
        }
    }
	/*public static int[] build_array(int size) {
		Random rnd = new Random();
		int[] array = new int[size];
		int nxt = 0;
		for (int i = 0; i < size ; i++) {
		nxt += rnd.nextInt(size);
		array[i] = nxt;
		}
		return array;
		
	}*/
	public static int[] build_array(int size) {
		int[] array = new int[size];
		for (int i = 0; i < size ; i++) {
			array[i]= i;
		}
		return array;
		
	}
	
	public static void main(String[] args) {
		 long average;
	       long sum = 0;
	       int n = 10;
	       for(int i= 0; i < 10 ; i++) {
	    	   
	    	  for (int l = 0; l < 10; l++) {
	    	    long t0 = System.nanoTime();
	    		  //build_List(n);
	    	    build_array(n);
	    	    long t1 = System.nanoTime();
	    		
	    		 sum += (t1 - t0);
	    		 
	    		}
	    	average =  sum/10;
	        System.out.println( average);
	       // System.out.println(n);
	        
	        n*=2;
	       }

	}

}
