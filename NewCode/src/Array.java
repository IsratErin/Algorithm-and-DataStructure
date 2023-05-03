import java.util.Arrays;
import java.util.Random;

public class Array {
	
   public static int[] append_array(int[] array1, int[] array2) {
		
		int[] array = new int[array1.length + array2.length];
		
		for(int i = 0; i < array1.length; i++) {
			array[i] = array1[i];
			
		}
		int a = array1.length;
		for(int j = 0; j < array2.length; j++) {
			array[a] = array2[j];
			a++;
			
		}
		return array;
   }
   private static int[] create_array(int n) {
		Random rnd = new Random();
		int[] array = new int[n];
		int nxt = 0;
		for (int i = 0; i < n ; i++) {
		nxt += rnd.nextInt(n);
		array[i] = nxt;
		}
		return array;
		}
   
   public static void main(String[] args) {
	   long average;
       long sum = 0;
       int n = 10;
	   
	   int[] a1 = {1,2,3,4};
	   
	   for(int i= 0; i < 10 ; i++) {
	   int[] a2 = create_array(n); 
		   
	  
	   for (int l = 0; l < 10; l++) {
	   long t0 = System.nanoTime();
	   append_array(a1 , a2);
	   long t1 = System.nanoTime();
	   
	   sum += (t1 - t0);
	   
	   }
	   average =  sum/10;
	   System.out.println( average);
	   
	   //System.out.println(n);
	   n*= 2;
	   
	   }  
	   
   }
	


}
