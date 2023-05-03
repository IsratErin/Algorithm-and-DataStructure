
public class Paths {
	 City[] path;
	 int sp;
	public Paths() {
	path = new City[54];
	sp = 0;
	}
	private Integer shortest(City from, City to, Integer max) {
	if((max != null) && (max<0)) {
		return null;
	}
	if(from==to) {
		return 0;
	}
    
	for (int i = 0; i < sp; i++) {
	if (path[i] == from)
	return null;
	}
	path[sp] = from;
	sp++;
	Integer shrt = null;
	for (int i = 0; i < from.neighbors.length; i++) {
		if (from.neighbors[i] != null) {
		Connection conn = from.neighbors[i];
		Integer distancee = shortest(conn.city, to, max- conn.distance);
        if((distancee != null)&&((shrt== null)||(shrt> distancee + conn.distance))) {
        	shrt= distancee + conn.distance;
        }
       
      
		}
	}
	path[sp--] = null;
	//System.out.println(shrt);
	return shrt;
	}
	
	private Integer shortest1(City from, City to, Integer max) {
		if((max != null) && (max<0)) {
			return null;
		}
		if(from==to) {
			return 0;
		}
	    
		for (int i = 0; i < sp; i++) {
		if (path[i] == from)
		return null;
		}
		path[sp++] = from;
		
		Integer shrt = null;
		for (int i = 0; i < from.neighbors.length; i++) {
			if (from.neighbors[i] != null) {
			Connection conn = from.neighbors[i];
			//System.out.println(conn.city);
			Integer distancee = shortest1(conn.city, to, max - conn.distance);
			if((distancee != null)&&((shrt== null)|| (shrt > distancee + conn.distance))) {
				//System.out.println("distance from" + conn.city+ " to " + to.name + " is " + distancee);
	        	shrt= distancee + conn.distance;	
	        	//System.out.println("shrt: " + shrt);
	        }
			if((shrt != null) && (shrt < max)) {
				//System.out.println("max from " + from.name + " set to " + to.name + " :" + shrt);
	        	max = shrt;
	        	//System.out.println("max " + max);
	        	
	        }
			}	
			
		}
	
		path[sp--] = null;
		//System.out.println("shrt " + shrt);
		return shrt;
		}
	
	public static void main(String[] args) {
		Map map = new Map("src\\trains.csv");
		String from = args[0];
		String to = args[1];
		//Integer max = Integer.valueOf(args[2]);
		Paths p = new Paths();
		long t0 = System.nanoTime();
		//Integer dist = p.shortest(map.lookup(from), map.lookup(to), max);
		Integer dist = p.shortest1(map.lookup(from), map.lookup(to), 3000);
		
		long time = (System.nanoTime() - t0)/1000;
		//ns to ms
		System.out.println("Shorest distance from " + from + " to "+ to + " is "+ dist + " min (" + time + " us)");
		}
	

}
