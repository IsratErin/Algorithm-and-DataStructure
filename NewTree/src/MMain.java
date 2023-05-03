
public class MMain {
	public static void main(String[] arg) {
		
		BinaryTree tree = new BinaryTree();
		tree.add(5, 5);
		

		int[] sizes = {100,200,300,400,500,600,700,800,900,1000,1100,1200,1300,1400,1500,1600};

		
		
		for ( int n : sizes) {

		    int loop = 10000;
		    

		    System.out.printf("%8d", n);

		    int k = 1000;
		    
		    double min = Double.POSITIVE_INFINITY;

		    for (int i = 0; i < k; i++) {
			long t0 = System.nanoTime();
			tree.lookup(5);
			long t1 = System.nanoTime();
			double t = (t1 - t0);
			if (t < min)
			    min = t;
		    }

		    System.out.printf("%8.0f", (min/loop));	    

		    	    	    
		}
	    }

}
