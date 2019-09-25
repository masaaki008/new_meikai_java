package Screen03;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        // 2つの整数の小さいほうと大きいほうの値を求めて表示
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数a:"); int a = stdIn.nextInt();
        System.out.print("整数b:"); int b = stdIn.nextInt();

        int min, max;
        if (a < b) {
            min = a;
            max = b;
        } else {
            min = b;
            max = a;
        }

        System.out.println("小さい値は" + min);
        System.out.println("大きい値は" + max);
    }
}
