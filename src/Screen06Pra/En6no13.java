package Screen06Pra;

import java.util.Scanner;

public class En6no13 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("要素数:");
        int n = stdIn.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = stdIn.nextInt();
        }

        int m;
        int l;
        for (m = 0, l = n - 1; m < n; m++, l--) {
            b[l] = a[m];
        }

        for (int i = 0; i < n; i++)
            System.out.println("b[" + i + "] = " + b[i]);
    }
}
