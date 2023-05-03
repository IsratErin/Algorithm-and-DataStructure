
public class City {
	public String name;
	public Connection[] neighbors;
	
	public String toString(){
        return   name  ;
    }
	public City(String name){
		this.name = name;
		this.neighbors = new Connection[4];
	}
	
	public void connect(City city , Integer distance){
		for(int i = 0; i < neighbors.length ; i++ ) {
			if(neighbors[i]== null) {
				neighbors[i] = new Connection(city, distance);
				return ;
			}
		}
		int length = 2*neighbors.length;
		Connection[] moreneighbors = new Connection[length];
		
		for( int j = 0; j < neighbors.length ; j++ ) {
			moreneighbors[j] = neighbors[j];
		}
		moreneighbors[neighbors.length] =  new Connection(city, distance);
		neighbors = moreneighbors;
	}
	

}
