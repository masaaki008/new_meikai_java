package Screen07;

import java.util.Scanner;

// List7-16
// 線形探索
public class LinearSearch {
    static int linearSearch(int[] a, int key) {
        for (int i = 0; i < a.length; i++)
            if (a[i] == key)
                return i;
        return -1;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("要素数:");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        for (int i = 0; i < x.length; i++) {
            System.out.print("x[" + i + "] :");
            x[i] = stdIn.nextInt();
        }
        System.out.print("探す値:");
        int ky = stdIn.nextInt();

        int idx = linearSearch(x, ky);

        if (idx == -1)
            System.out.println("その値は存在しません");
        else
            System.out.println("その値はx[" + idx + "]にあります");
    }
}
