

public class BinarySearchTree {
	public void add(Integer key, Integer value){
        Node node = new Node(key,value);

        if (root == null) {
            root = node;
            return;
        }
        Node current_node = root;
        while(true){
            if(key == current_node.key){
                break;
            }

            else if(key < current_node.key) {
                if(current_node.left == null){
                    current_node.left = node;
                    break;
                }
                current_node = current_node.left;
            }
            else {
                if(current_node.right == null){
                    current_node.right = node;
                    break;
                }
                current_node = current_node.right;
            }
        }
    }
for (int mes = 0; mes < measurements; mes++) {

            sequence = new int[n];

            for(int i = 0; i< n; i++){
                sequence[i] = rnd.nextInt(10n);
            }
            for (int i = 0; i < sequence.length; i++) {
                int randomIndexToSwap = rnd.nextInt(sequence.length);
                int temp = sequence[randomIndexToSwap];
                sequence[randomIndexToSwap] = sequence[i];
                sequence[i] = temp;
                midsum += sequence[i];
            }
            mid = midsum /n-1;
            tree.add(mid, mid +100);
            //System.out.println(Arrays.toString(sequence));


           for(int i = 1; i < sequence.length; i++){
                value = 100 + sequence[i];
                key = sequence[i];

                tree.add(key, value);
            }
           //System.out.println(tree.isBinarySearchTree());

          //tree.print(tree.root);
           //System.out.println();
          lookup = new int[n];
            sum = 0;
            for (int l = 0; l< 100; l++){

                for(int i = 0; i< n; i++){
                    lookup[i] = rnd.nextInt(10n);
                }

                long t0 = System.nanoTime();
                for(int i = 0; i < lookup.length; i++){
                    tree.lookup(lookup[i]);
                }
                long t1 = System.nanoTime();
                sum += (t1 - t0);
                lookup = new int[n];
                //tree = new BinaryTree();
            }

            avrg = sum/100 ;
            //System.out.println();
            n += 100;

           System.out.println(avrg);

        }*/
}
  
  


