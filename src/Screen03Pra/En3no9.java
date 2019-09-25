package Screen03Pra;

import java.util.Scanner;

public class En3no9 {
    public static void main(String[] args) {
        // 2つの変数を読み込んで大きい値を表示
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数a:"); int a = stdIn.nextInt();
        System.out.print("整数b:"); int b = stdIn.nextInt();

        System.out.println("大きい方の値は" + (a > b ? a : b));
    }
}
