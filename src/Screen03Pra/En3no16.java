package Screen03Pra;

import java.util.Scanner;

public class En3no16 {
    public static void main(String[] args) {
        // 3つの整数を読み込んで昇順ソート
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数a:"); int a = stdIn.nextInt();
        System.out.print("整数b:"); int b = stdIn.nextInt();
        System.out.print("整数c:"); int c = stdIn.nextInt();

        if (a > b) {
            int t = a;
            a = b;
            b = t;
        }
        if (b > c) {
            int t = b;
            b = c;
            c = t;
        }
        if (a > b) {
            int t = a;
            a = b;
            b = t;
        }

        System.out.println("昇順ソートしました");
        System.out.println("a:" + a);
        System.out.println("b:" + b);
        System.out.println("c:" + c);
    }
}
