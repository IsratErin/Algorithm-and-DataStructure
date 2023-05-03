import java.io.BufferedReader;
import java.io.FileReader;

public class ZipColl {
	
	String[] keys= new String[9675];
	int max;
	public  ZipColl(String file) {
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line;
			int length = 0;
			
			while ((line = br.readLine()) != null) {
			String[] row = line.split(",");
			String key= row[0].replaceAll("\\s", "");
			keys[length++]= key;
			}
			max = length-1;
			
			} catch (Exception e) {
			System.out.println(" file " + file + " not found");
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


}
