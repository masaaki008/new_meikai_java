package Screen03Pra;

import java.util.Scanner;

public class En3no12 {
    public static void main(String[] args) {
        // 3つの整数値から最小値を求める
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数a:"); int a = stdIn.nextInt();
        System.out.print("整数b:"); int b = stdIn.nextInt();
        System.out.print("整数c:"); int c = stdIn.nextInt();

        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;

        System.out.println("最小値は" + min);
    }
}
