package Screen06;

import java.util.Random;
import java.util.Scanner;

// List6-5
public class IntArrayRand {
    public static void main(String[] args) {
        // 配列の全要素に乱数を代入して横向きの棒グラフで表示
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        System.out.print("要素数:");
        int n = stdIn.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = 1 + rand.nextInt(10);

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] : ");
            for (int j = 0; j < a[i]; j++)
                System.out.print('*');
            System.out.println();
        }
    }
}
