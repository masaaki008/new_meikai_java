package Screen10Pra.en10no3;

import java.util.Scanner;

public class MinMaxTester {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("x:"); int x = stdIn.nextInt();
        System.out.print("y:"); int y = stdIn.nextInt();
        System.out.print("z:"); int z = stdIn.nextInt();
        System.out.print("配列aの要素数:");
        int num = stdIn.nextInt();
        int[] a = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("a[" + i + "] : ");
            a[i] = stdIn.nextInt();
        }

        System.out.printf("x, yの最小値は%d\n", MinMax.min(x, y));
        System.out.printf("x, yの最大値は%d\n", MinMax.max(x, y));

        System.out.printf("x, y, zの最小値は%d\n", MinMax.min(x, y, z));
        System.out.printf("x, y, zの最大値は$d\n", MinMax.max(x, y, z));

        System.out.printf("配列aの最小値は%d\n", MinMax.min(a));

        int xmin[] = MinMax.minIndexArray(a);
        System.out.print("そのインデックスは{ ");
        for (int i = 0; i < xmin.length; i++)
            System.out.print(xmin[i] + " ");
        System.out.println("}");

        System.out.printf("配列aの最大値は%d\n", MinMax.max(a));

        int xmax[] = MinMax.maxIndexArray(a);
        System.out.print("そのインデックスは{ ");
        for (int i = 0; i < xmax.length; i++)
            System.out.print(xmax[i] + " ");
        System.out.println("}");
    }
}
