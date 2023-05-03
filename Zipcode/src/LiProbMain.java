
public class LiProbMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String file = "src\\postnummer.csv";
		NewS z = new NewS(file);
		//z.insert(30592, null);
		System.out.println();
		System.out.println(z.lookup(11115));
		
		System.out.println(z.lookup(30592));
		
		System.out.println(z.lookup(60592));
         System.out.println(z.lookup(90592));
		
		System.out.println(z.lookup(30295));
		
		//System.out.println(z.lookup(70592));
		
		//System.out.println(z.lookup(80592));
		
		
		
		//System.out.println(z.lookup(99499));

	}

}
