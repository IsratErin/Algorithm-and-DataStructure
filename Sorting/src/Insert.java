import java.util.Random;

public class Insert {

	public static void main(String[] args) {
		
		
		//int [] arr = { 5,1,12,-5,16,30,25};
		//int [] b = insertionsort1(arr);
		//System.out.println("{" +b[0] + "," +b[1]+ "," +b[2]+ "," +b[3]+ "," +b[4]+"," +b[5]+ "," +b[6]+ "}");
		
		
		 int n = 200;
	        long t = 0;
	        long t_average = 0;

	        for (int i = 0; i < 58; i++) {
	            int[] array = new int[n];
	            
	            Random rnd = new Random();
	            for (int k = 0; k < n; k++) {
	                array[k] = rnd.nextInt(n);
	            }

	            for (int l = 0; l < 10; l++) {
	            	int[] copy = array.clone();
	                long t0 = System.nanoTime();
	                insertionsort1(copy);
	                long t1 = System.nanoTime();
	                t += t1 - t0;

	            }

	            t_average = t/10;
	            //System.out.println("n : " + n + "    average : " + t_average + " ns");
	            System.out.println(t_average);

	            n += 100;

	        }
		

	}
	public static int[] insertionsort( int[] array) {
		for (int i = 0; i < array.length-1; i++) {
			for ( int j = i+1 ; j > 0 && array[j-1] > array[j] ; j-- ) {
				int tmp = array[j];
				array[j]= array[j-1];	
				array[j-1]= tmp;			
			}
		}
		return array;
		
	}
	public static int[] insertionsort1( int[] array) {
		for (int i = 0; i < array.length; i++) {
			int current = array[i];
			int j;
			for (  j = i ; j > 0 && current < array[j-1] ; j-- ) {
				array[j]= array[j-1] ;
				
			}
			array[j]= current;
			
		}
		
		return array;
	}

}
