import java.util.Random;

public class New {

		public static void main(String[] args) {
			long t1_linearsearch = 0;
			//long t2_binarysearch = 0;
			int n = 200;
			for (int i = 0; i < 15; i++) {
			int [] a1 = sorted(n);
			int [] a2 = sorted(n);
			 //int[] a1 = new int[]{5,8,10,16,20,25,33,55,61,75,77,80,82,87};
		     //int[] a2 = new int[]{5,9,11,17,22,23,24,25,61,77,78,80,84,87};
			int tries = 10;
			for (int j = 0; j < tries; j++) {
				long t0 = System.nanoTime();
		        search3(a1,a2);
		        long t1 = System.nanoTime();
		        t1_linearsearch += t1 - t0;
				}
				long avg1 = t1_linearsearch/tries;
				//System.out.println("n : " + n + "    average : " + avg1 + " ns");
				System.out.println( avg1 );
		        n+=100;
		   }
			System.out.println();
			
			

		}
		public static void search3(int[] array1, int[] array2 ){
			int second = 0;
			int first = 0;
			while ((first <= array1.length-1) && (second <= array2.length-1)){
	             
	             
	             if(array2[second ] > array1[first]){
	                 first++;
	                 
	             }
	             else if(array2[second] < array1[first]) {
	            	 second++;
	                 }             
	             else {
	            	 //System.out.println("Duplicate is found in index " + second + " second array and in index " + first + " first array");
	            	 first++;
	            	 second++;
	             }
			}
		
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
