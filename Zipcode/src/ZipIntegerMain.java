
public class ZipIntegerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long avg;
		long sum=0;
		
		String file = "src\\postnummer.csv";
		ZipInteger z = new ZipInteger(file);
		
		
		//System.out.println("Lookup:");
		for (int l = 0; l < 1000; l++) {
		long t0 = System.nanoTime();
		//z.lookup(11115);
		//z.lookup(99499) ;
		//z.binarysearch(11115);
		//z.binarysearch(99499);
		//z.binary_lookup(11115);
		z.binary_lookup(99499);
		long t1 = System.nanoTime();
		sum+= (t1-t0);
		}
		avg = sum/1000;
		System.out.println(avg);
		//System.out.println(z.lookup(11115) );
		//System.out.println(z.lookup(99499) );
		//System.out.println(z.binarysearch(99499));

	}

}
