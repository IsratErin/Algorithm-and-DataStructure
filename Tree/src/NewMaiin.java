import java.util.Random;
// right one
public class NewMaiin {
	public static void main(String args[]){

        long sum;
        long average = 0;
        int measurements = 15;
        int n = 1000;
        Random rnd = new Random();
        BinaryTree tree = new BinaryTree();

        for (int mes = 0; mes < measurements; mes++){

            int[] sequence = new int[n];
            for (int i = 0; i < n; i++){
                sequence[i] = rnd.nextInt(5*n);
            }
            for(int k= 0; k < sequence.length ; k++) {
				tree.add(sequence[k], (100+sequence[k]));
				}

            sum = 0;
            for(int iterations = 0; iterations < 100; iterations++) {

                long t0 = System.nanoTime();
                tree.lookup(sequence[iterations]);
                long t1 = System.nanoTime();
                sum += (t1-t0);

                if ( iterations > n -2)
                    break;
            }
            average = sum/100;

            System.out.println(average);
            //System.out.println(heap.size);
            n+= 2000;
            //System.out.println(n);
        }

    }


	

}
