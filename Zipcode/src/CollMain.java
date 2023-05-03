
public class CollMain {

	public static void main(String[] args) {
		String file = "src\\postnummer.csv";
		ZipColl z = new ZipColl(file);
		z.collisions(10000);
		z.collisions(20000);
		z.collisions(12345);
		
		z.collisions(100000);
		

	}

}
