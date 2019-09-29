package Screen06;

import java.util.Scanner;

// List6-1
public class PointSumAve {
    public static void main(String[] args) {
        // 点数を読み込んで合計点・平均点を表示
        Scanner stdIn = new Scanner(System.in);

        int sum = 0;
        System.out.println("5人の点数を入力せよ");

        System.out.print("1番の点数:");
        int yamane = stdIn.nextInt();
        sum += yamane;

        System.out.print("2番目の点数:");
        int takada = stdIn.nextInt();
        sum += takada;

        System.out.print("3番目の点数:");
        int kawachi = stdIn.nextInt();
        sum += kawachi;

        System.out.print("4番目の点数:");
        int koga = stdIn.nextInt();
        sum += koga;

        System.out.print("5番目の点数:");
        int tozuka = stdIn.nextInt();
        sum += tozuka;

        System.out.println("合計は" + sum);
        System.out.println("平均は" + (double)sum / 5);
    }
}
