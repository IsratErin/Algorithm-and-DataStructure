
public class Naive {
	
	
	
	private static Integer shortest(City from, City to, Integer max) {
		if (max < 0)
		return null;
		if (from == to)
		return 0;
		Integer shrt = null;
		for (int i = 0; i < from.neighbors.length; i++) {
			if (from.neighbors[i] != null) {
			Connection conn = from.neighbors[i];
			Integer distancee = shortest(conn.city, to, max- conn.distance);
	        if((distancee != null)&&((shrt== null)|| (shrt> distancee + conn.distance))) {
	        	shrt= distancee + conn.distance;
	        }
	        if((shrt != null) && (shrt < max)) {
	        	max = shrt;
	        	System.out.println("max from " + from.name + " set to " + shrt);
	        }
			}
		}
		return shrt;
		}
	public static void main(String[] args) {
		Map map = new Map("src\\trains.csv");
		String from = args[0];
		String to = args[1];
		Integer max = Integer.valueOf(args[2]);
		long t0 = System.nanoTime();
		Integer dist = shortest(map.lookup(from), map.lookup(to), max);
		long time = (System.nanoTime() - t0)/1_000_000;
		System.out.println("Shorest distance from " + from + " to "+ to + " is "+ dist + " min (" + time + " ms)");
		}

}
