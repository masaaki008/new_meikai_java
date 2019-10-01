package Screen06Pra;

import java.util.Scanner;

public class En6no18 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("行数:");
        int n = stdIn.nextInt();

        int[][] c = new int[n][];

        for (int i = 0; i < n; i++) {
            System.out.print(i + "行の列数:");
            int m = stdIn.nextInt();
            c[i] = new int[m];
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.print(i + "行目の" + j + "列の要素:");
                c[i][j] = stdIn.nextInt();
            }
        }

        System.out.println("各行の要素は:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.printf("%3d", c[i][j]);
            }
            System.out.println();
        }
    }
}
