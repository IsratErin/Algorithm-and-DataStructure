import java.util.Random;

public class Sorted {
        
	public static void main(String[] args) {
		long t_search = 0;
		int n = 1000;
		
		for (int i = 0; i < 10; i++) {
		//int [] a = sorted(n);
		int tries = 1000;
		t_search = 0;
		for (int j = 0; j < tries; j++) {
		int [] a = sorted(n);
		long t0 = System.nanoTime();
        search_sorted(a, 10);
        long t1 = System.nanoTime();
        t_search += t1 - t0;
		}
		long avg = t_search/tries;
		//System.out.println("n : " + n + "    average : " + avg + " ns");
		System.out.println( avg );
        n+=5000;
        //System.out.println("1st:" + a[0]+ " 2nd:"+a[1] + " 3rd:"+a[2] + " 4th:" +a[3]);
        
		}
		
		

	}
	public static boolean search_sorted(int[] array, int key) {
		for (int index = 0; index < array.length ; index++) {
		if ( array[index] == key && key < array[index+1] ){
		return true;
		}
		}
		return false;
		}
	
	private static int[] sorted(int n) {
		Random rnd = new Random();
		int[] array = new int[n];
		int nxt = 0;
		for (int i = 0; i < n ; i++) {
		nxt += rnd.nextInt(10) + 1;
		array[i] = nxt;
		}
		return array;
		}

}
