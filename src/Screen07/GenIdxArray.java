package Screen07;

import java.util.Scanner;

// List7-19
// 全要素がインデックスと同じ値をもつ配列の生成
public class GenIdxArray {
    static int[] idxArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = i;
        return a;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("要素数は:");
        int n = stdIn.nextInt();
        int[] x = idxArray(n);

        for (int i = 0; i < n; i++)
            System.out.println("x[" + i + "] = " + x[i]);
    }
}
