import java.io.BufferedReader;
import java.io.FileReader;




public class LiProb {
	
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
	int mod= 10000;
	Node[] data;
	Node[] data1;
	Node[] nodearr;
	//String[] keys= new String[9675];
	Integer[] keys;
	public  LiProb(String file) {
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			
			String line;
			int length = 0;
			int length1 = 0;
			//data1= new Node[100000];
			data1= new Node[10000];
			keys= new Integer[9675];
			//keys= new String[20000];
			while ((line = br.readLine()) != null) {
			String[] row = line.split(",");
			//String key= row[0].replaceAll("\\s", "");
			Integer code= Integer.valueOf(row[0].replaceAll("\\s", ""));
			keys[length++]= code;
			//data1[code]= new Node(code, row[1], Integer.valueOf(row[2]));
			//code++;
			data1[length1++]= new Node(code, row[1], Integer.valueOf(row[2]));
			}
			max = length-1;
			
			} catch (Exception e) {
			System.out.println(" file " + file + " not found");
			}
		    data= new Node[20000];
		     nodearr = new Node[10000];
		for(int i = 0; i <= max; i++) {
			//Integer key = Integer.valueOf(keys[i]);
			Integer key = keys[i];
			Integer index = key % mod;
			Node entry = data1[i];
			nodearr[i] =entry;
			//data[index]= nodearr[i];
			
		}
		
		
	}
	
	
	public Node insert1(Integer key, Node entry) {
		Integer index = key % mod;
		//Node nxt= data[index];
		Integer indx = index;
		do {
		if(data[indx] == null) {
			data[indx] = entry;
			return data[indx];
		}
		
			if(data[indx].code.equals(key)) {
				//indx = (key+1) %mod;
				indx = indx + 1;
				//return data[indx];
			}	
			
				
		}while(indx != index);
		return data[indx];	
		
	}
	public Node insert4(Integer key, Node entry)
    {
        Integer tmp = key % mod;
        Integer i = tmp;
        do {
            if (data[i] == null) {
                data[i] = entry;
                
                return data[i];
            }
            
            if (data[i] != null) {
            if (data[i].code.equals(key)) {
                //data[i] = entry;
            	i++;
            	 //i = (i + 1) % mod;
                return data[i];
            }
            }
            
            //i++;
            
           // i = (i + 1) % mod;
 
        } while (i != tmp);
        return data[i];
    }
	
	public Node insert(Integer key, Node entry) {
		Integer index = key % mod;
		Integer indx = index;
		Node nxt = data[indx];
		if(nxt== null) {
			nxt= entry;
			return nxt;
		}
		
		return nxt;
		
		
	}
	public Node insert3(Integer key, Node entry){
	    
	    Integer index = key % mod;
	      // hash the key
	    // until empty cell or -1,
	    while (data[index] != null ) {
	    
	      ++index; // go to next cell
	    
	      index %= data.length; // wraparound if necessary
	    }
	   
	    data[index] = entry; // insert item
	    return data[index];
	  }
	 
	 
	public String lookup(Integer key) {
		Integer indx = key % mod;
		Node nxt = data[indx];
		while(nxt != null) {
			if(key.equals(nxt.code)){
				return nxt.name ;
			}
			indx= indx+1;
			nxt= data[indx];
		}
		return null ;
	}

}
