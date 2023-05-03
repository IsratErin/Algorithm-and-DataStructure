import java.util.Random;

public class Mainnnnn {
	public static void main(String[] args) {
		 long sum;
	        long average = 0;
	        int measurements = 10;
	        int n = 10;
	        Random rnd = new Random();



	        BinaryTree tree = new BinaryTree();


	        for (int mes = 0; mes < measurements; mes++){

	            int[] sequence = new int[n];
	            for (int i = 0; i < n; i++){
	                sequence[i] = rnd.nextInt(10*n);
	            	//sequence[i]= i;
	            }
	            for (int j = 0; j < n; j++){
	            tree.add(sequence[j],sequence[j]);
	            }
	            sum = 0;

	            for(int iterations = 0; iterations < n; iterations++) {
                    
	                long t0 = System.nanoTime();
	                for (int c = 0; c< n; c++){
	                tree.lookup(sequence[c]);
	                }
	                long t1 = System.nanoTime();

	                sum += (t1-t0);
	            }
	            average = sum/n;

	            System.out.println(average);
	            //System.out.println(heap.size);
	           // System.out.println(n);
	            n *= 2;
	        }

	    }
		
	}


