import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		int n = 2500; 
		int measurements = 1;
        long average;
        long sum = 0;
        
       for (int i = 0; i < measurements; i++) {
        int[] sequence = new int[n];
		Random rnd = new Random();
		/*for(int j = 0; j < n; j++) {
			sequence[j] = rnd.nextInt(10*n);	
		}
		BinaryTree tree = new BinaryTree();
		
		
		//System.out.println("The tree");
		
		//tree.inorderTraversal(tree.root);
		//tree.inOrderTraverseTree(tree.root);
		//System.out.println("The root: " + tree.root());
		/*System.out.println();
		System.out.println();
		
		System.out.println("The value:");*/
		
	   
		sum= 0;
		for (int l = 0; l < 5000; l++) {
			for(int j = 0; j < n; j++) {
				sequence[j] = rnd.nextInt(10*n);	
			}
			BinaryTree tree = new BinaryTree();
			for(int k= 0; k < sequence.length ; k++) {
				tree.add(sequence[k], (100+sequence[k]));
				}
			
		
			long t0 = System.nanoTime();
			for(int c= 0; c < sequence.length; c++) {
			tree.lookup(sequence[c]);
			}
			long t1 = System.nanoTime();
			
			sum += (t1 - t0);
		
		}
		average = sum/5000;
		//System.out.println();
		//System.out.println("The time");
		System.out.println( average);
		//System.out.println(n);
		n+= 500;
        }
		
		
	}

}
