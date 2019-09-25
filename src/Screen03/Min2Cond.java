package Screen03;

import java.util.Scanner;

public class Min2Cond {
    public static void main(String[] args) {
        // 読み込んだ2つの値の小さいほうを表示(条件演算子ver)
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数a:"); int a = stdIn.nextInt();
        System.out.print("整数b:"); int b = stdIn.nextInt();

        int min = a < b ? a : b;
        System.out.println("小さいほうの値は" + min);
    }
}
