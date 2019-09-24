package Screen02;

// Scannerメソッドをimport
import java.util.Scanner;

public class ArithInt {
    public static void main(String[] args) {
        // 2つの整数を読み込んで加減乗除した値を表示

        // 文字入力のためのインスタンスの生成
        // System.inはキーボードと結びつく標準入力ストリーム
        Scanner stdIn = new Scanner(System.in);

        System.out.print("xの値:");
        // xに整数値を読み込む
        int x = stdIn.nextInt();

        System.out.print("yの値:");
        // yに整数値を読み込む
        int y = stdIn.nextInt();

        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x % y = " + (x % y));
    }
}
