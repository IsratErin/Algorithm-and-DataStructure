import java.io.BufferedReader;
import java.io.FileReader;

public class ZipColHan {
	Node[] data;
	int max;
	public class Node {
		Integer code;
		String name;
		Integer pop;
		Node next;
		Node(Integer c, String n, Integer p){
			this.code = c;
			this.name= n;
			this.pop= p;
			this.next= null;
			
		}
		public String toString(){
	         return  code+ ","+ name + "," + pop;
	     }
			
	}
	int mod= 11000;
    
	Node[] data1;
	//String[] keys= new String[9675];
	String[] keys;
	public  ZipColHan(String file) {
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			
			String line;
			int length = 0;
			//int length1 = 0;
			data1= new Node[100000];
			keys= new String[9675];
			while ((line = br.readLine()) != null) {
			String[] row = line.split(",");
			String key= row[0].replaceAll("\\s", "");
			Integer code= Integer.valueOf(row[0].replaceAll("\\s", ""));
			keys[length++]= key;
			data1[code]= new Node(code, row[1], Integer.valueOf(row[2]));
			code++;
			}
			max = length-1;
			
			} catch (Exception e) {
			System.out.println(" file " + file + " not found");
			}
		    //data= new Node[10000];
		data= new Node[mod];
		for(int i = 0; i <= max; i++) {
			int key = Integer.valueOf(keys[i]);
			Integer index = key % mod;
			Node entry = data1[key];
			Node newNode= insert(key,entry);	
			data[index]= newNode;
			/*if(index == 1115) {
				if(data[index].next != null) {
				System.out.println(data[index].name);
				data[index]= data[index].next;
				}
			}*/
		}
		
		
	}
	public void collisions(int mod) {
		int[] data = new int[mod];
		int[] cols = new int[10];
		
		for (int j = 0; j <= max; j++) {
		int key = Integer.valueOf(keys[j]);
		Integer index = key % mod;
		//if(data[index] != 0) {
		cols[data[index]]++;
		//}
		data[index]++;
		
		}
		System.out.print(mod);
		for (int i = 0; i < 10; i++) {
		System.out.print("\t" + cols[i]);
		}
		System.out.println();
	}
	
	
	public Node insert(Integer key, Node entry) {
		Integer indx = key % mod;
		Node nxt= data[indx];
		Node prv = null;
		while(nxt!= null) {
			if(key.equals(nxt.code)) {
				nxt= nxt.next;
			}
			prv= nxt;
			nxt= nxt.next;
		}
		if(prv != null) {
			prv.next= entry;
			entry.next= nxt;
			
		}else {
			data[indx]= entry;
			entry.next= nxt;
		}
		return data[indx];
		
	}
	public String lookup(Integer key) {
		Integer noOfelements= 0;
		Integer indx = key% mod;
		Node nxt = data[indx];
		while(nxt != null) {
			if(key.equals(nxt.code)){
				return nxt.name + " " + "Passed:" + noOfelements;
			}
			nxt = nxt.next;
			noOfelements++;
		}
		return null ;
	}
	public String lookup1(Integer key) {
		Integer noOfelements= 0;
		Integer index = key% mod;
		Node current = data[index];
		while(current != null) {
			if(key.equals(current.code)){
				return current.name + " " + "Number of elements that we have passed:" + noOfelements;
			}
			current = current.next;
			noOfelements++;
		}
		return null ;
	}
	public void insert1(Integer key, Node node) {
		Integer indx = key % mod;
		Node current= data[indx];
		Node prev = null;
		while(current!= null) {
			if(key.equals(current.code)) {
				current= current.next;
			}
			prev= current;
			current= current.next;
		}
		if(prev != null) {
			prev.next= node;
			node.next= current;
			
		}else {
			data[indx]= node;
			node.next= current;
		}	
	}
	
	
	

}
