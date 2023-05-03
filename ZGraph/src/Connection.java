
public class Connection {
	City city;
	Integer distance;
	public String toString(){
        return   city + "," + distance ;
    }
	public Connection(City city, Integer distance) {
		this.city = city;
		this.distance = distance;
	}
	

}
