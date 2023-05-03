
public class ZipColHanMain {

	public static void main(String[] args) {
		String file = "src\\postnummer.csv";
		ZipColHan z = new ZipColHan(file);
		System.out.println();
        
		System.out.println(z.lookup(11115));
		System.out.println(z.lookup(30592));
		
		System.out.println(z.lookup(60592));
		
		System.out.println(z.lookup(70592));
		
		System.out.println(z.lookup(80592));
		
		System.out.println(z.lookup(90592));
		
		System.out.println(z.lookup(30295));
		
		
		

	}

}
