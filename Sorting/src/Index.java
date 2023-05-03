
public class Index {
	public static void main(String[] arg) {

		int[] sizes = {100,200,300,400,500,600,700,800,900,1000,1100,1200,1300,1400,1500,1600};
		int [] arr = { 5,1,12,-5,16,30,25};
		System.out.printf("# sorting an array of length n, time in ns\n");
		

		    int loop = 10000;
		    //int[] array = sorted(n);
		    //int[] indx = keys(loop, n);

		    

		    int k = 1000;
		    
		    double min = Double.POSITIVE_INFINITY;

		    for (int i = 0; i < k; i++) {
			long t0 = System.nanoTime();
			sectionsort(arr);
			long t1 = System.nanoTime();
			double t = (t1 - t0);
			if (t < min)
			    min = t;
		    }

		    System.out.printf("%8.0f", (min/loop));	    
	    	    
		
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
