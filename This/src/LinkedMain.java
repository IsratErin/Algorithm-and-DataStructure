import java.util.Arrays;

import java.util.Random;



public class LinkedMain {
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
		}
		
		for (int z = 0; z < measurements; z++) {
		LinkedList a = new LinkedList();
		LinkedList.Node[] array = new LinkedList.Node[n];
		sum= 0;
		
		for (int l = 0; l < 500; l++) {
			
			for (int i = 0; i < n; i++) {
	            array[i]= a.insert(i); 
	        }
			long t0 = System.nanoTime();
	   for(int m = 0; m < sequence.length ; m++ ) {
		
	    a.remove(array[sequence[m]]);
	    a.addback(array[sequence[m]]);
		} 
		long t1 = System.nanoTime();
		sum += (t1 - t0);
		}
		average = sum/500;
		System.out.println( average);
		
		//System.out.println("final");
		//System.out.println(Arrays.toString(a.toArray()));
		
		//System.out.println(n);
		/*for(int e = 0; e < sequence.length ; e++ ) {
			
		    a.addback(array[sequence[e]]);
		    
		    System.out.println(Arrays.toString(a.toArray()));
			}
        System.out.println(Arrays.toString(a.toArray()));*/
        //System.out.println(n);
		  
		 
		
        n*= 2;
        //k+=5;
		
	}
	}

}
