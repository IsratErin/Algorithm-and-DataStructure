import java.util.Random;

public class EvenBetter {
	

	public static void main(String[] args) {
		long t1_search = 0;
		//long t2_binarysearch = 0;
		int n = 200;
		for (int i = 0; i < 15; i++) {
		int [] a1 = sorted(n);
		int [] a2 = sorted(n);
		
		int tries = 10;
		for (int j = 0; j < tries; j++) {
			long t0 = System.nanoTime();
	        search(a1,a2);
	        long t1 = System.nanoTime();
	        t1_search += t1 - t0;
			}
			long avg1 = t1_search/tries;
			//System.out.println("n : " + n + "    average : " + avg1 + " ns");
			System.out.println( avg1 );
	        n+=100;
	   }
		System.out.println();
		
		

	}
	public static void search(int[] x, int[] y ){
		for(int j = 0; j < x.length; j++) {
			int key = x[j];
			binary_search(y, key);
			}
		
	}
	
	public static boolean binary_search(int[] array, int key) {
		int first = 0;
		int last = array.length-1;
		while (true) {
			// jump to the middle
			int index = first + ((last-first)/2) ;
			if (array[index] == key) {
			// hmm what now?
			return true;
			}
			if (array[index] < key && index < last && first!= last ) {
			
			first = index +1 ;
			
			continue;
			}
			if (array[index] > key && index > first && first!= last) {
			
			last = index -1 ;
			continue;
			}
			
		    return false;
	  }
	}
	public static boolean linear_search(int[] array, int key) {
		for (int index = 0; index < array.length ; index++) {
		if ( array[index] == key && key < array[index+1] ){
		return true;
		}
		}
		return false;
		
		}
	private static int[] sorted(int n) {
		Random rnd = new Random();
		int[] array = new int[n];
		int nxt = 0;
		for (int i = 0; i < n ; i++) {
		nxt += rnd.nextInt(10) + 1;
		array[i] = nxt;
		}
		return array;
		}
	

}
