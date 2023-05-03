import java.util.Random;
public class Linear {
	public static void main(String[] args) {
		
		int n = 200;
		long t = 0;
		
		for (int k = 0; k < 15; k++) {
		int[] a = new int[n];
		for (int j = 0; j < n; j++) {
            a[j] = j;
        }
		Random rnd = new Random();
		for (int i = 0; i < n ; i++) {
		    a[i] =  rnd.nextInt(n);
		}
		
		 int tries = 10;
	    
		for (int i = 0; i < tries; i++) {
		    long n0 = System.nanoTime();	
		    search_unsorted(a , 6);
		    long n1 = System.nanoTime();
		    t += (n1 - n0);
		    //System.out.println(t);
		    }
		long avg = t/tries ;
		    //System.out.println("The average time for n=" +n+ " is "+ avg + " ns ");
		    System.out.println(avg);
		    n+= 100; 
		    
		}
	    }

		public static boolean search_unsorted(int[] array, int key) {
			for (int index = 0; index < array.length ; index++) {
			if (array[index] == key) {
			return true;
			}
			}
			return false;
			}
	}

