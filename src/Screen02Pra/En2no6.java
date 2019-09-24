package Screen02Pra;

import java.util.Scanner;

public class En2no6 {
    public static void main(String[] args) {
        // 2つの実数値(高さと底辺)を読み込んで、三角形の面積を求める

        Scanner stdIn = new Scanner(System.in);

        System.out.println("三角形の面積を求めます");

        System.out.print("底辺:");
        double height = stdIn.nextDouble();

        System.out.print("高さ:");
        double weight = stdIn.nextDouble();

        System.out.println("面積は" + (height * weight / 2));
    }
}
