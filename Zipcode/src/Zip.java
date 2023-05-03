import java.io.BufferedReader;
import java.io.FileReader;

public class Zip {
	Node[] data;
	int max;
	public class Node {
		String code;
		String name;
		Integer pop;
		Node(String c, String n, Integer p){
			this.code = c;
			this.name= n;
			this.pop= p;
			
		}
		public String toString(){
	         return  code+ ","+ name + "," + pop;
	     }
			
	}
	public  Zip(String file) {
		
		data = new Node[10000];
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
		String line;
		int i = 0;
		while ((line = br.readLine()) != null) {
		String[] row = line.split(",");
		data[i++] = new Node(row[0], row[1], Integer.valueOf(row[2]));
		//System.out.println(data[i-1]);
		}
		max = i-1;
		} catch (Exception e) {
		System.out.println(" file " + file + " not found");
		}
		}

	public String lookup(String code) {
		for(int i=0; i <= max; i++) {
			if(data[i]!= null) {
			if(data[i].code.equals(code)) {
				return  data[i].name ;
			}
			}
		}
		return null;
	}
	public String binarysearch(String code) {
		int i= 0;
		//int maxx = data.length-1;
		int maxx = max;
		while (true) {
			int indx = i + ((maxx-i)/2) ;
			if (data[indx].code.equals(code)) {
			return data[indx].name;
			}
			int compare= data[indx].code.compareTo(code);
			if ( compare < 0 && indx < maxx && i!= maxx ) {
				i = indx +1 ;
				continue;
				}
			if (compare > 0 && indx > i && i!= maxx) {
				maxx = indx -1 ;
				continue;
				}
			
			return null;
			
		}
		
	}
	/*public String binary_lookup(Integer target) {
        int left = 0;
        int right = data.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (data[middle].code.equals(target))
                return data[middle].name;

            if (target < data[middle].code)
                right = middle - 1;
            else
                left = middle + 1;
        }

        return null;
    }*/
	public String binary_lookup(String target) {
        int left = 0;
        //int right = data.length - 1;
        int right= max;
        while (left <= right) {
            int middle = (left + right) / 2;

            if (data[middle].code.equals(target))
                return data[middle].name;
            int compare = data[middle].code.compareTo(target);
            if (compare > 0)
                right = middle - 1;
            else
                left = middle + 1;
        }

        return null;
    }
		

}
