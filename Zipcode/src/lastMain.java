
public class lastMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String file = "src\\postnummer.csv";
		last z = new last(file);
	    
        System.out.println(z.get_linear(11115));
        
        System.out.println(z.get_linear(30592));
		
		System.out.println(z.get_linear(60592));
		
		System.out.println(z.get_linear(70592));
		
		System.out.println(z.get_linear(80592));
		
		System.out.println(z.get_linear(90592));
		
		System.out.println(z.get_linear(30295));
		System.out.println(z.get_linear(99499));
	}

}
