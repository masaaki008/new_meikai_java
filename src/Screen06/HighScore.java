package Screen06;

import java.util.Scanner;

// List6-8
public class HighScore {
    public static void main(String[] args) {
        // 点数を読み込んで最高点を表示
        Scanner stdIn = new Scanner(System.in);
        final int ninzu = 5;
        int[] tensu = new int[ninzu];

        System.out.println(ninzu + "人の点数を入力せよ");
        for (int i = 0; i < ninzu; i++) {
            System.out.print((i + 1) + "番の点数:");
            tensu[i] = stdIn.nextInt();
        }

        int max = tensu[0];
        for (int i = 1; i < tensu.length; i++)
            if (tensu[i] > max) max = tensu[i];

        System.out.println("最高点は" + max);
    }
}
