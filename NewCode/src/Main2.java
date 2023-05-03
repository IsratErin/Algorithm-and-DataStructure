import java.util.Arrays;
//a fixed
public class Main2 {
	public static void main(String[] args) {

        int n = 10;
        int measurements = 10;
        long average;
        long sum = 0;


        for (int i = 0; i < measurements; i++) {

            LinkedList b = new LinkedList();

            for (int k = 1; k <= n; k++) {
                b.insert((k + 10));
            }

            LinkedList a = new LinkedList();

            for (int m = 1; m <= 10; m++) {
                a.insert(m);
            }
            int[] array_a = a.toArray();
            sum = 0;
            for (int l = 0; l < 1000; l++) {

                a = new LinkedList();
                for (int m = 1; m <= 10; m++) {
                    a.insert(m);
                }
               

                long t0 = System.nanoTime();
                a.append(b);
                long t1 = System.nanoTime();

                sum += (t1 - t0);

            }

            array_a = a.toArray();
            //System.out.println("List a : " + Arrays.toString(array_a));
            //System.out.println("List b : " + Arrays.toString(b.toArray()));

            
            average = sum/1000;
            //System.out.println(n);
            System.out.println(average);
            n *= 2;

        }
    }

}
