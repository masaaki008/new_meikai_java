package Screen02;

import java.util.Scanner;

public class ArithDouble {
    public static void main(String[] args) {
        // 2つの実数値(double型)を読み込んで加減乗除した値を表示

        Scanner stdIn = new Scanner(System.in);

        System.out.println("xとyを加減乗除します");

        System.out.print("xの値:");
        double x = stdIn.nextDouble();

        System.out.print("yの値:");
        double y = stdIn.nextDouble();

        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x % y = " + (x % y));
    }
}
