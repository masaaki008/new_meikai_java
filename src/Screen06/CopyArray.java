package Screen06;

import java.util.Scanner;

// List6-13
public class CopyArray {
    public static void main(String[] args) {
        // 配列の全要素をコピーして表示
        Scanner stdIn = new Scanner(System.in);

        System.out.print("要素数:");
        int n = stdIn.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = stdIn.nextInt();
        }

        for (int i = 0; i < n; i++)
            b[i] = a[i];

        System.out.println("aの全要素をbにコピーしました");
        for (int i = 0; i < n; i++)
            System.out.println("b[" + i + "] = " + b[i]);
    }
}
