
public class NewMain {
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.add(5,105);
		tree.add(2,102);
		tree.add(7,107);
		tree.add(1,101);
		tree.add(8,108);
		
		
		
		
		for (int i : tree) {
		System.out.println("next value " + i);
		
		
		}
	
	tree.add(11,103);
	tree.add(12,103);
	for (int i : tree)
		System.out.println("next value " + i);
	}

}
