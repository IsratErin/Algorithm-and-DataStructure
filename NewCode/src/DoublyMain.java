import java.util.Arrays;

import java.util.Random;

public class DoublyMain {

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
		DoublyLinkedList b = new DoublyLinkedList();
		
		DoublyLinkedList.Node[] array = new DoublyLinkedList.Node[n];
		for (int i = 0; i < n; i++) {
            array[i]= b.insert(i); 
        }
		//array[sequence[i]] = list.add(sequence[i])
		//System.out.println(Arrays.toString(b.toArray()));
		
		//System.out.println();
		sum = 0;
		for (int l = 0; l < 1000; l++) {
			long t0 = System.nanoTime();
			for(int m = 0; m < sequence.length ; m++ ) {
		    b.remove(array[sequence[m]]);
		    b.addback(array[sequence[m]]);
			}
		    long t1 = System.nanoTime();
		    sum += (t1 - t0);
			}
		 //System.out.println(Arrays.toString(b.toArray()));
			average = sum/1000;
			System.out.println( average);
			
			/*for(int e = 0; e < sequence.length ; e++ ) {
			    
			    b.addback(array[sequence[e]]);
				}
	        System.out.println(Arrays.toString(b.toArray()));*/
	        //System.out.println();
	        //System.out.println( average);
	        n*=2;
		


	}
	}

}
