import java.util.Random;

public class Binary {
	public static void main(String[] args) {
		long t_search = 0;
		int n =16;
		
		for (int i = 0; i < 20; i++) {
		int [] a = sorted(n);
		int tries = 100;
		t_search = 0;
		for (int j = 0; j < tries; j++) {
			//int [] a = sorted(n);
		long t0 = System.nanoTime();
        binary_search(a, 10);
        long t1 = System.nanoTime();
        t_search += t1 - t0;
		}
		long avg = t_search/tries;
		//System.out.println("n : " + n + "    average : " + avg + " ns");
		//System.out.println(n);
		System.out.println( avg );
        n*=2;
		}
		

	}
	
	public static int[] sorted(int n) {
		Random rnd = new Random();
		int[] array = new int[n];
		int nxt = 0;
		for (int i = 0; i < n ; i++) {
		nxt += rnd.nextInt(10) + 1;
		array[i] = nxt;
		}
		return array;
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
			// The index position holds something that is less than
			// what we're looking for, what is the first possible page?
			first = index +1 ;
			
			continue;
			}
			if (array[index] > key && index > first && first!= last) {
			// The index position holds something that is larger than
			// what we're looking for, what is the last possible page?
			last = index -1 ;
			continue;
			}
			
			// Why do we land here? What shoudl we do?
			
	
           
		    return false;
	  }
	}

}
