import java.util.Random;

public class AfirstTry {
	  public static void main (String[]args) {

	        int n = 200;
	        long t_arraysearch = 0;
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
	                search_unsorted(array, 6);
	                long t1 = System.nanoTime();
	                t_arraysearch += t1 - t0;

	            }

	            t_average = t_arraysearch/10;
	            //System.out.println("n : " + n + "    average : " + t_average + " ns");
	            System.out.println(t_average);

	            n += 100;

	        }

	    }
	        public static boolean search_unsorted (int[] array, int key){

	            for (int index = 0; index < array.length; index++) {
	                if (array[index] == key) {
	                    return true;
	                }

	            }
	            return false;
	        }


}
