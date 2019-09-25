package Screen03Pra;

import java.util.Scanner;

public class En3no13 {
    public static void main(String[] args) {
        // 3つの整数の中央値を求める
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数a:"); int a = stdIn.nextInt();
        System.out.print("整数b:"); int b = stdIn.nextInt();
        System.out.print("整数c:"); int c = stdIn.nextInt();

        System.out.println("中央値は" + ((a + b + c) / 3));
    }
}
