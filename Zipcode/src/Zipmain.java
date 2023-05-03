
public class Zipmain {

	public static void main(String[] args) {
		long avg;
		long sum=0;
		
		String file = "src\\postnummer.csv";
		Zip z = new Zip(file);
		
		
		//System.out.println("Lookup:");
		for (int l = 0; l < 1000; l++) {
		long t0 = System.nanoTime();
		//z.lookup("111 15");
		//z.lookup("994 99") ;
		//z.binarysearch("111 15");
		//z.binarysearch("994 99");
		//z.binary_lookup("111 15");
		//z.binary_lookup("994 99");
		long t1 = System.nanoTime();
		sum+= (t1-t0);
		}
		avg = sum/1000;
		System.out.println(avg);
		System.out.println(z.lookup("230 41") );
		//System.out.println(z.binarysearch("984 99"));
		
		
		
	}

}
