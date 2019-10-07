package Screen07Pra;

import java.util.Scanner;

public class En7no33 {
    static void printArray(int[] a) {
        for (int i = 0; i < a.length - 1; i++)
            System.out.print(a[i] + "  ");
        System.out.print(a[a.length - 1]);
        System.out.println();
    }

    static void printArray(int[][] a) {
        int[][] width = new int[a.length][];
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            width[i] = new int[a[i].length];
            if (a[i].length > max)
                max = a[i].length;
        }
        int[] maxWidth = new int[max];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                int value = a[i][j];
                width[i][j] = (value < 0) ? 1 : 0;
                do {
                    width[i][j]++;
                    value /= 10;
                } while (value != 0);
                if (width[i][j] > maxWidth[j])
                    maxWidth[j] = width[i][j];
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
                for (int k = 0; k <= maxWidth[j] - width[i][j]; k++)
                    System.out.print(' ');
            }
            System.out.println(a[i][a[i].length - 1]);
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("1次元配列xの要素数:");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }
        System.out.print("2次元配列yの行数:");
        int height = stdIn.nextInt();
        int[][] y = new int[height][];
        for (int i = 0; i < y.length; i++) {
            System.out.print(i + "行目の列数:");
            int width = stdIn.nextInt();
            y[i] = new int[width];
        }
        System.out.println("各要素の値を入力せよ");
        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < y[i].length; j++) {
                System.out.printf("y[%d][%d]:", i, j);
                y[i][j] = stdIn.nextInt();
            }
        }
        System.out.println("\n1次元配列x");
        printArray(x);
        System.out.println("\n2次元配列y");
        printArray(y);
    }
}
