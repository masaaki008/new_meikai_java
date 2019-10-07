package Screen07Pra;

import java.util.Scanner;

public class En7no30 {
    static int min(int a, int b) {
        return a < b ? a : b;
    }

    static int min(int a, int b, int c) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        return min;
    }

    static int min(int[] a) {
        int min = a[0];
        for (int i : a)
            if (i < min)
                min = i;
        return min;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("a:"); int a = stdIn.nextInt();
        System.out.print("b:"); int b = stdIn.nextInt();
        System.out.print("c:"); int c = stdIn.nextInt();
        System.out.print("要素数:"); int n = stdIn.nextInt();
        int[] d = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("c[" + i + "] = ");
            d[i] = stdIn.nextInt();
        }

        System.out.println("aとbの最小値" + min(a, b));
        System.out.println("aとbとcの最小値" + min(a, b, c));
        System.out.println("d[]の最小値" + min(d));
    }
}
