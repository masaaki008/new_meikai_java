package Screen03Pra;

import java.util.Scanner;

public class En3no15 {
    public static void main(String[] args) {
        // 2つの整数を読み込んで降順ソート
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数a:"); int a = stdIn.nextInt();
        System.out.print("整数b:"); int b = stdIn.nextInt();

        if (a < b) {
            int t = a;
            a = b;
            b = t;
        }

        System.out.println("降順ソートしました");
        System.out.println("整数a:" + a);
        System.out.println("整数b:" + b);
    }
}
