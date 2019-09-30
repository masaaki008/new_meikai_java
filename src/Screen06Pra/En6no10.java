package Screen06Pra;

import java.util.Random;
import java.util.Scanner;

public class En6no10 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        System.out.print("要素数:"); int n = stdIn.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = 1 + rand.nextInt(10);

        for (int i = 1; i < n; i++) {
            if (a[i] == a[i - 1]) {
                a[i] = 1 + rand.nextInt(10);
            }
        }

        for (int i = 0; i < n; i++)
            System.out.println("a[" + i + "] = " + a[i]);
    }
}
