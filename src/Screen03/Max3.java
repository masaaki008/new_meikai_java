package Screen03;

import java.util.Scanner;

public class Max3 {
    public static void main(String[] args) {
        // 3つの整数値の最大値を求める
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数a:"); int a = stdIn.nextInt();
        System.out.print("整数b:"); int b = stdIn.nextInt();
        System.out.print("整数c:"); int c = stdIn.nextInt();

        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        System.out.println("最大値は" + max);
    }
}
