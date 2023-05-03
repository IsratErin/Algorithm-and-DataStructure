import java.io.BufferedReader;
import java.io.FileReader;
//Right one for slightly better
public class NewS {
	int max;
	public class Node {
		Integer code;
		String name;
		Integer pop;
		
		Node(Integer c, String n, Integer p){
			this.code = c;
			this.name= n;
			this.pop= p;
			
		}
		public String toString(){
	         return  code+ ","+ name + "," + pop;
	     }
			
	}
	
	Node[] data;
	Integer[] keys;
	Node[] bArray ;
	Integer mod = 20000;
	
	
	public  NewS(String file) {
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			
			String line;
			int length = 0;
			int length1 = 0;
			keys = new Integer[10000];
			data = new Node[10000];
			while ((line = br.readLine()) != null) {
			String[] row = line.split(",");
			
			Integer code= Integer.valueOf(row[0].replaceAll("\\s", ""));
		    keys[length++]= code;// only has zip codes
			data[length1++]= new Node(code, row[1], Integer.valueOf(row[2]));
			}
			max = length1-1;
			
			} catch (Exception e) {
			System.out.println(" file " + file + " not found");
			}
		
		bArray= new Node[mod];
		for(int i= 0; i<= max; i++) {
			Integer key = keys[i];
			Node entry = data[i];
			insert(key, entry);
		}
	}
	
	public void insert(Integer key, Node entry) {
		Integer indx = key % mod;
		Node node = bArray[indx];
		if(node == null) {
			bArray[indx] = entry;
			return;
		}
		else {
			while(node !=null) {	
					indx = indx+1;
				node = bArray[indx];
				if(node == null) {
					bArray[indx] = entry;
					return;
				}
			}
			
		}	
	}
	
	public String lookup(Integer key) {
		Integer noOfelements= 0;
		Integer indx = key % mod;
		Node nxt = bArray[indx];
		while(nxt != null) {
			if(key.equals(nxt.code)){
				
				return nxt.name + " " + "Passed:" + noOfelements ;
			}
			indx= indx+1;
			nxt= bArray[indx];
			noOfelements++;
		}
		return null ;
	}
	
}
