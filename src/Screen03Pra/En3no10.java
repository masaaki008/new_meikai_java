package Screen03Pra;

import java.util.Scanner;

public class En3no10 {
    public static void main(String[] args) {
        // 2つの整数値を読み込んでそれらの差を表示する
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数a:"); int a = stdIn.nextInt();
        System.out.print("整数b:"); int b = stdIn.nextInt();

        System.out.println("2つの整数の差は" + (a > b ? a - b : b - a));
    }
}
