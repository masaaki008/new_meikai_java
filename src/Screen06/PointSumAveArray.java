package Screen06;

import java.util.Scanner;

// List6-7
public class PointSumAveArray {
    public static void main(String[] args) {
        // 点数を読み込んで合計点・平均点を表示(配列版)
        Scanner stdIn = new Scanner(System.in);
        int sum = 0;
        final int ninzu = 5;
        int[] tensu = new int[ninzu];

        System.out.println(ninzu + "人の点数を入力せよ");
        for (int i = 0; i < ninzu; i++) {
            System.out.print((i + 1) + "番の点数:");
            tensu[i] = stdIn.nextInt();
            sum += tensu[i];
        }

        System.out.println("合計は" + sum);
        System.out.println("平均は" + (double)sum / ninzu);
    }
}
