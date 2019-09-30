package Screen06Pra;

import java.util.Scanner;

public class En6no6 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("要素数:"); int n = stdIn.nextInt();
        int[] tensu = new int[n];

        int sum = 0;
        for (int i = 0; i < tensu.length; i++) {
            System.out.print((i + 1) + "番の点数:");
            tensu[i] = stdIn.nextInt();
            sum += tensu[i];
        }

        int max = tensu[0];
        int min = tensu[0];

        for (int i = 1; i < tensu.length; i++) {
            if (tensu[i] > max) max = tensu[i];
            if (tensu[i] < min) min = tensu[i];
        }

        System.out.println("合計点:" + sum);
        System.out.println("平均点:" + (double)sum / tensu.length);
        System.out.println("最高点:" + max);
        System.out.println("最低点:" + min);
    }
}
