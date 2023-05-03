import java.util.Random;

public class EvenBetter2 {
	public static void main(String[] args) {
		long t1_search = 0;
		//long t2_binarysearch = 0;
		int n = 200;
		for (int i = 0; i < 15; i++) {
		//int [] a1 = sorted(n);
		//int [] a2 = sorted(n);
			//int[] list1 = new int[]{5,8,12,16,20,25,33,55,61,75};
	        //int[] list2 = new int[]{5,9,11,12,22,23,24,25,61,75};
	        int[] list1 = new int[]{5,8,10,16,20,25,33,55,61,75};
	        int[] list2 = new int[]{5,9,11,17,22,23,24,25,61,63};
		int tries = 10;
		for (int j = 0; j < tries; j++) {
			long t0 = System.nanoTime();
	        //search(a1,a2);
			search1(list1,list2);
	        long t1 = System.nanoTime();
	        t1_search += t1 - t0;
			}
			long avg1 = t1_search/tries;
			//System.out.println("n : " + n + "    average : " + avg1 + " ns");
			//System.out.println( avg1 );
	        n+=100;
	   }
		System.out.println();
		

	}
	
	public static void search1(int[] array1, int[] array2 ) {
		int index=0;
		int first=0;
		int second =0;
		while (index < array1.length || index < array2.length){

            //System.out.println(array1.length);
           /* if ((second  == array2.length -1)){
            	System.out.println("Duplicate is found in index " + second + " second array and in index " + first + " first array");
              break;

            }*/

            if (array2[second + 1] < array1[first + 1]) {
                second++;
                index = second;
                

            }
            else if (array2[second] == array1[first]){
                System.out.println("Duplicate is found in index " + second + " second array and in index " + first + " first array");
                second++;
                first++;
                index = second;
                


            }
            else if (array2[second + 1] > array1[first + 1]){
                first++;
                index = first;
                
                

            }
            else if (array2[second + 1] == array1[first + 1]){
                first++;
                second++;
                index = second;
                System.out.println("Duplicate is found in index " + second + " second array and in index " + first + " first array");
                
             }
            /*else if ((array1[array1.length-1] == array2[array2.length-1]) || (array1[array1.length-1] != array2[array2.length-1])){
                System.out.println("no");
             }*/
            else if(second + 1 == array2.length && first + 1 == array1.length ) {
                break;
            }
            else break;
            
          
        }
		
	}
	
	
	public static boolean binary_search(int[] array, int key) {
		int first = 0;
		int last = array.length-1;
		while (true) {
			// jump to the middle
			int index = first + ((last-first)/2) ;
			if (array[index] == key) {
			// hmm what now?
			return true;
			}
			if (array[index] < key && index < last && first!= last ) {
			// The index position holds something that is less than
			// what we're looking for, what is the first possible page?
			first = index +1 ;
			
			continue;
			}
			if (array[index] > key && index > first && first!= last) {
			// The index position holds something that is larger than
			// what we're looking for, what is the last possible page?
			last = index -1 ;
			continue;
			}
			
			// Why do we land here? What shoudl we do?
			
           
		    return false;
	  }
	}
	public static boolean linear_search(int[] array, int key) {
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
