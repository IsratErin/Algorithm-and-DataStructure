import java.util.Random;

public class TRY {

	public static void main(String[] args) {
		    int n = 200;
	        long t = 0;
	        long t_average = 0;

	        for (int i = 0; i < 15; i++) {
	            int[] array = new int[n];
	            for (int j = 0; j < n; j++) {
	                array[j] = j;
	            }

	            Random rnd = new Random();
	            for (int k = 0; k < n; k++) {
	                array[k] = rnd.nextInt(n);
	            }

	            for (int l = 0; l < 10; l++) {
	                long t0 = System.nanoTime();
	                sectionsort(array);
	                long t1 = System.nanoTime();
	                t += t1 - t0;

	            }

	            t_average = t/10;
	            //System.out.println("n : " + n + "    average : " + t_average + " ns");
	            System.out.println(t_average);

	            n += 100;

	        }

	}
	public static int[] sectionsort( int[] array) {
		
		for (int i = 0; i < array.length -1; i++) {
			// let's set the first candidate to the index itself
			int cand = i;
			
			
			for ( int j = i+1; j < array.length ; j++) {
			// If the element at position j is smaller than the value
			// at the candidate position - then you have a new candidate
			// posistion.
				if(array[j] < array[cand]) {
					cand = j;
				}
					
			}
			// Swap the item at position i with the item at the candidate position.
			int min = array[cand];
			array[cand] = array[i];
			array[i] = min;
			
			}
		return array;
	
		

	}

}
