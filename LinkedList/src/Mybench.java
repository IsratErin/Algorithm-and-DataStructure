
public class Mybench {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		LinkedList list2 = new LinkedList();
		for(int i = 0 ; i < 10 ; i++) {
		list.insert(5);
		}
		
		
		list.insert(6);
		list.insert(7);
		list.insert(8);
		list.insert(9);
		
	    //list.print();
	    
	    //int[] arraylist = list.toArray();
		//System.out.println("The size is " + list.getsize());
		//System.out.println(java.util.Arrays.toString(arraylist));
		
		
		list2.insert(1);
		list2.insert(2);
		list2.insert(3);
		list2.insert(4);
		//int[] arraylist2 = list2.toArray();
		//System.out.println(java.util.Arrays.toString(arraylist2));
		long t = 0;
        long t_average = 0;
       // int n = 10;
        for(int l = 0; l < 1; l++) {
        for (int i = 0; i <10 ; i++) {
        long t0 = System.nanoTime();
	    list2.append(list);
	    long t1 = System.nanoTime();
	    if ( i < 9) {
	    list2 = new LinkedList();
	    list2.insert(1);
		list2.insert(2);
		list2.insert(3);
		list2.insert(4); 
	    }
	    t = t1 - t0;
        }
	
        
        //for(int l = 0; l < 1; l++) {
       /* for (int i = 0; i <10 ; i++) {
            long t0 = System.nanoTime();
    	    list2.append(list);
    	    long t1 = System.nanoTime();
    	    if ( i < 9) {
    	    list2 = new LinkedList();
    	    for(int j= 0; j < 10 ; j++) {
    	    list2.insert(1);
    	    
    	    }
    	    t = t1 - t0;
         }
        }*/
        
        
        
        
        
        t_average = t/10;
	    //System.out.println("Time took for n ="+n+ "is" + t_average + "ns");
        System.out.println(t_average);
        
         //n+=10;
        
        
        
	    int[] finallist = list2.toArray();
	    System.out.println(java.util.Arrays.toString(finallist));
        }
        
        }
	    
        
	
		

}
