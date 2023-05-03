import java.util.Arrays;

import java.util.Random;

public class NewMain {

	public static void main(String[] args) {
		int n = 10;
		int k = 5;
		
		int measurements = 10;
        long average;
        long sum = 0;
		
		int[] sequence = new int[k];
		Random rnd = new Random();
		for(int j = 0; j < k; j++) {
			sequence[j] = rnd.nextInt(n);
			//sequence[j] = j;
			
		}
		System.out.println("The sequence array :"); 
		System.out.println(Arrays.toString(sequence));
		
		for (int z = 0; z < measurements; z++) {
		LinkedList a = new LinkedList();
		LinkedList.Node[] array = new LinkedList.Node[n];
		for (int i = 0; i < n; i++) {
            array[i]= a.insert(i); 
        }
		//System.out.println(Arrays.toString(a.toArray()));
		
		sum= 0;
		for (int l = 0; l < 1000; l++) {
		long t0 = System.nanoTime();
		for(int m = 0; m < sequence.length ; m++ ) {
			
	    a.remove(array[sequence[m]]);
	    a.addback1(array[sequence[m]]);
	    
		}
	    long t1 = System.nanoTime();
	    sum += (t1 - t0);
		}
		//System.out.println(Arrays.toString(a.toArray()));
		average = sum/1000;
		System.out.println( average);
		
		/*for(int e = 0; e < sequence.length ; e++ ) {
		    
		    a.addback(array[sequence[e]]);
			}
        System.out.println(Arrays.toString(a.toArray()));
        System.out.println();
		  */
		 
		
        n*= 2;
        //k+=5;
		
	}
	}

}
