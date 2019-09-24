package Screen02Pra;

import java.util.Scanner;

public class En2no5 {
    public static void main(String[] args) {
        // 2つの実数値を読み込み、和と平均を表示する

        Scanner stdIn = new Scanner(System.in);

        System.out.print("xの値:");
        double x = stdIn.nextDouble();

        System.out.print("yの値:");
        double y = stdIn.nextDouble();

        System.out.println("x, yの和は" + (x + y));
        System.out.println("x, yの平均は" + ((x + y) / 2));
    }
}
