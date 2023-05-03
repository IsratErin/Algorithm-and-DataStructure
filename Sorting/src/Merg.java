import java.util.Random;

public class Merg {

	public static void main(String[] args) {
		/*int [] arr = { 5,1,12,-5,16,30,25};
	    sort(arr);
		System.out.println("{" +arr[0] + "," +arr[1]+ "," +arr[2]+ "," +arr[3]+ "," +arr[4]+"," +arr[5]+ "," +arr[6]+ "}");
		*/
		 int n = 2500;
	        long t = 0;
	        long t_average = 0;

	        for (int i = 0; i < 30; i++) {
	            int[] array = new int[n];
	          
	            Random rnd = new Random();
	            for (int k = 0; k < n; k++) {
	                array[k] = rnd.nextInt(n);
	            }

	            for (int l = 0; l < 10; l++) {
	            	int[] copy = array.clone();
	                long t0 = System.nanoTime();
	                sort(copy);
	                long t1 = System.nanoTime();
	                t += t1 - t0;

	            }

	            t_average = t/10;
	            //System.out.println("n : " + n + "    average : " + t_average + " ns");
	          System.out.println(t_average);
             // System.out.println(n);
	            n += 2500;

	        }

	}
	public static void sort(int[] org) {
		if (org.length == 0)
		return ;
		int[] aux = new int[org.length];
		sort(org, aux, 0, org.length -1);
		}
	private static void sort(int[] org, int[] aux, int lo, int hi) {
		if (lo != hi) {
		int mid = lo + (hi-lo)/2;
		// sort the items from lo to mid
		
		sort(org , aux, lo, mid);
		// sort the items from mid+1 to hi
		
		sort(org , aux, mid+1, hi);
		
		// merge the two sections using the additional array
		merge(org, aux, lo, mid, hi);
		}
		}
	private static void merge(int[] org, int[] aux, int lo, int mid, int hi) {
		// copy all items from lo to hi from org to aux
		for ( int l = lo; l <= hi ; l++ ) {
			aux[l]= org[l];
		}
		/*for (int i = 0; i < org.length; i++ ){
	           aux[i] = org[i];
	     }*/
		
		// let's do the merging
		int i = lo; // the index in the first part
		int j = mid+1; // the index in the second part
		// for all indices from lo to hi
		for ( int k = lo; k <= hi; k++) {
		// if i is greater than mid, move the j item to the org array, update j
		if( i> mid) {
			org[k]= aux[j];
			j++;	
		}
		// else if j is greater than hi, move the i item to the org array, update i
		else if(j>hi){
			org[k]= aux[i];
			i++;
			
		}
		// else if the i item is smaller than the j item,
		// move it to the org array, update i
		else if(aux[i] < aux[j] ) {
			org[k] = aux[i];
			i++;
		}
		// else you can move the j item to the org array, update j
		else {
			org[k] = aux[j];
			j++;
		}
		}
		}


}
