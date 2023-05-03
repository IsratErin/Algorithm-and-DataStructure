import java.io.BufferedReader;
import java.io.FileReader;


public class ZipKey {
	Node[] data;
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
	public  ZipKey(String file) {
		
		data = new Node[100000];
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
		String line;
		int index = 0;
		while ((line = br.readLine()) != null) {
		String[] row = line.split(",");
		Integer code= Integer.valueOf(row[0].replaceAll("\\s", ""));
		index= code;
		//data[index++] = new Node(code, row[1], Integer.valueOf(row[2]));
		data[index] = new Node(code, row[1], Integer.valueOf(row[2]));
		//System.out.println(data[i-1]);
		}
		//max = index-1;
		max = index;
		} catch (Exception e) {
		System.out.println(" file " + file + " not found");
		}
		}

	
	public String lookup(Integer code) {
		//for(int i=11115; i<=max; i++) {
		for(int i=0; i<data.length; i++) {
			if(data[i]!= null) {
			if(data[i].code.equals(code)) {
				return  data[i].name ;
			}
			}
		}
		return null;
	}
	public String lookup1(Integer key) {
		Integer i = key;
		if(data[i]!= null) {
		return data[i].name;
		}
		 return null;
	}
	
	public String binary_lookup1(Integer target) {
         int left = 11115;
		//int left =0;
        //int right = max;
        int right = max;
        while (left <= right) {
            int middle = (left + right) / 2;
            Integer value = middle;
            //if (data[middle].code.equals(target))
            if(value.equals(target)) {	
                return data[middle].name;
            }

           // if (target < data[middle].code)
            if (target < value)
                right = middle - 1;
            else
                left = middle + 1;
        }

        return null;
    }
	public String binary_lookup(Integer key) {
       int left = 11115;
       int right = max;
       while (left <= right) {
           int middle = (left + right) / 2;
           Integer value = middle;
           if(value.equals(key)) {	
               return data[middle].name;
           }
           if (key < value)
               right = middle - 1;
           else
               left = middle + 1;
       }
       return null;
   }

}
