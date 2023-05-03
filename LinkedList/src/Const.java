import java.util.Arrays;

public class Const {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
        int measurements = 3;
        int average;
        int sum = 0;


        for (int i = 0; i < measurements; i++) {

            LinkedList a = new LinkedList();

            for (int k = 1; k <= n; k++) {
                a.insert((k + 10));
            }

            LinkedList b = new LinkedList();

            for (int m = 1; m <= 10; m++) {
                b.insert(m);
            }
            int[] array_a = a.toArray();

            for (int l = 0; l < 1000; l++) {

                a = new LinkedList();
                for (int k = 1; k <= n; k++) {
                    a.insert((k + 10));
                }

                long t0 = System.nanoTime();
                a.append(b);
                long t1 = System.nanoTime();

                sum += (t1 - t0);

            }

                array_a = a.toArray();
                System.out.println("List a : " + Arrays.toString(array_a));
                n += 10;
                average = sum/1000;
                //System.out.println(average);

            }

	}

}
