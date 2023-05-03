import java.io.BufferedReader;
import java.io.FileReader;

public class Map {
	private City[] cities;
	private final int mod = 541;
	public Map(String file) {
	cities = new City[mod];
	try (BufferedReader br = new BufferedReader(new FileReader(file))) {
	String line;
	while ((line = br.readLine()) != null) {
		String[] row = line.split(",");
		City city1 = lookup(row[0]);
		City city2 = lookup(row[1]);
		Integer distance = Integer.valueOf(row[2]);
		city1.connect(city2, distance);
		city2.connect(city1, distance);
	
	}
	} catch (Exception e) {
	System.out.println(" file " + file + " not found or corrupt");
	}
	}
	private Integer hash(String name) {
		int hash = 7;
		for (int i = 0; i < name.length(); i++) {
		hash = (hash*31 % mod) + name.charAt(i);
		}
		return hash % mod;
		}
	public City lookup(String cityname) {
		Integer index = hash(cityname);
		while(true) {
		if(cities[index]== null) {
			//System.out.println(cityname+ " is at index" + index );
			break;
		}
		if(cities[index].name.equals(cityname)) {
			return cities[index];
		}
	
		//System.out.println("collision in hashing at " + index + "for "+ cityname +  "is not eq to " + cities[index].name  );
		
		index++;
		if(index == cities.length) {
			index = 0;
		}
		}
		City newcity = new City(cityname);
		cities[index]= newcity;
		//System.out.println(cityname+ " is at index" + index );
		
		return newcity;
		
	}
	

}
