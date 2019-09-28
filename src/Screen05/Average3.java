package Screen05;

import java.util.Scanner;

// List5-7
public class Average3 {
    public static void main(String[] args) {
        // 2つの整数値の平均値を求める(キャスト演算子を利用する)
        Scanner stdIn = new Scanner(System.in);

        System.out.println("整数値xとyの平均値を求めます");
        System.out.print("xの値:"); int x = stdIn.nextInt();
        System.out.print("yの値:"); int y = stdIn.nextInt();

        double ave = (double)(x + y) / 2;
        System.out.println("xとyの平均値は" + ave);
    }
}
