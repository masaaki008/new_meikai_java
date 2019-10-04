package Screen07;

import java.util.Scanner;

// List7-21
// 2値の最大値・3値の最大値を求めるメソッド(多重定義)
public class Max {
    static int max(int a, int b) {
        return a > b ? a : b;
    }

    static int max(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return c;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("x:"); int x = stdIn.nextInt();
        System.out.print("y:"); int y = stdIn.nextInt();
        System.out.print("z:"); int z = stdIn.nextInt();

        System.out.println("x,yの最大値は" + max(x, y));
        System.out.println("x,y,zの最大値は" + max(x, y, z));
    }
}
