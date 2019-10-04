package Screen07Pra;

import java.util.Scanner;

public class En7no22 {
    static int[] arrayClone(int[] a) {
        int n = a.length;
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = a[i];
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("要素数:");
        int n = stdIn.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = stdIn.nextInt();
        }

        int[] b = arrayClone(a);
        for (int i = 0; i < n; i++)
            System.out.println("a[" + i + "] = " + a[i]);
        for (int i = 0; i < b.length; i++)
            System.out.println("b[" + i + "] = " + b[i]);
    }
}
