package Screen06Pra;

import java.util.Scanner;

public class En6no8 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("要素数:"); int n = stdIn.nextInt();
        double[] a = new double[n];

        for (int j = 0; j < n; j++) {
            System.out.print("a[" + j + "] = ");
            a[j] = stdIn.nextDouble();
        }

        double sum = 0;
        for (double i : a)
            sum += i;

        System.out.println("合計:" + sum);

    }
}
