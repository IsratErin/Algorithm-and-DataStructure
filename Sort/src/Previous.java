import java.util.Random;
public class Previous {
		public static void main(String[] args){

	        //int m = 1000;
	        int n = 100;
	        int k = 1;
	        int sum = 0;

	        Random rnd = new Random();

	        int[] keys = new int[n];
	        int[] array = new int[n];
	        long t_total = 0;

	        for (int j = 0; j < k; j++) {
	            keys[j]  = rnd.nextInt(n);
	            array[j] = rnd.nextInt(n);

	            long t0 = System.nanoTime();
	            for (int ki = 0; ki < n; ki++) {
	                int key = keys[ki];
	                for (int i = 0; i < n; i++) {
	                    if (array[i] == key) {
	                        sum++;
	                        break;
	                    }
	                }
	            }
	            t_total += (System.nanoTime() - t0);
	        }

	        System.out.println("SEARCH ITEM TIME DUPLICATE :   " + t_total + "ns");


	}

        
}

