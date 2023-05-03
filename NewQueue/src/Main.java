
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree();
		tree.add(5);
		tree.add(2);
		tree.add(1);
		tree.add(7);
		tree.add(8);
		for (int i : tree) {
			System.out.println("next value " + i);
			}

	}

}
