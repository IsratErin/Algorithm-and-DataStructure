
public class ZipKeyMain {

	public static void main(String[] args) {
		long avg;
		long sum=0;
		String file = "src\\postnummer.csv";
		ZipKey z = new ZipKey(file);
		for (int l = 0; l < 1000; l++) {
			long t0 = System.nanoTime();
			//z.lookup1(11115);
			z.lookup1(99499) ;
			//z.binarysearch(11115);
			//z.binarysearch(99499);
			//z.binary_lookup(11115);
			//z.binary_lookup(99499);
			long t1 = System.nanoTime();
			sum+= (t1-t0);
			}
			avg = sum/1000;
			System.out.println(avg);
			//System.out.println(z.binary_lookup(99499) );
			//System.out.println(z.lookup1(11115) );

	}

}
