import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;

public class last {
	public class Node {
        Integer code;
        String name;
        Integer pop;
        Node next;

        public Node(Integer code, String name, Integer pop) {
            this.code = code;
            this.name = name;
            this.pop = pop;
        }
        public String toString(){
	         return  code+ ","+ name + "," + pop;
	     }
    }
    private LinkedList<Node>[] entries = new LinkedList[10000];

    Node[] data;
    Node[] array;
    Integer[] key;
    Integer mod = 10000;
    int max;
    int indx;
    int indx2;
    int i;
    int look_max;

    public last(String file) {
        data = new Node[10000]; // keys
        array = new Node[20000]; 
        key = new Integer[100000];// data1
        Integer index;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            int i = 0;
            while ((line = br.readLine()) != null) {
                String[] row = line.split(",");
                Integer code = Integer.valueOf(row[0].replaceAll("\\s", ""));
                data[i++] = new Node(code, row[1], Integer.valueOf(row[2]));
            }
            max = i - 1;
        } catch (Exception e) {
            System.out.println(" file " + file + "not found");
        }
        for (int i = 0; i < max; i++) {
            index = data[i].code;
            key[index] = index;
        }

        int[] keys = new int[max + 1];// data
        for (int i = 0; i <= max; i++) {
            keys[i] = data[i].code;
           //insert(keys[i],data[i]);
           insert_linear(keys[i]);
        }
        //System.out.println("TEST");
    }
    public void insert_linear(Integer key){
        //Integer index = hash(key);
         //Integer index = key % array.length;
    	Integer index = key % mod;
        if(array[index] == null) {
            array[index] = data[indx2];
            indx2++;
            return;
        }
        else{ while(array[index + i] != null){
            i++;
            if(look_max < i)
                look_max = i;
        }
        if(index + i > array.length -1){
            System.out.println("Array is too small");
            return;
        }
        array[index+i] = data[indx2];
        indx2++;
        i = 0;
        }
}
    public String get_linear(Integer key){
        //Integer index = hash(key);
 	//Integer index = key % array.length;
 	Integer index = key % mod;

        if(array[index] != null){
            if(array[index].code.equals(key))
                return array[index].name;
            else{
                for(int i = 1; i < look_max; i++){
                    if(array[index + i] != null) {
                        if (array[index + i].code.equals(key)) {
                            System.out.println("No. of elements passed: " + i);
                            return array[index + i].name;
                        }
                    }
                }
            }
        }
        return null;
 }







}
