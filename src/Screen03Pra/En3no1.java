package Screen03Pra;

import java.util.Scanner;

public class En3no1 {
    public static void main(String[] args) {
        // 入力した整数値の絶対値を表示する
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数値:");
        int n = stdIn.nextInt();

        if (n < 0)
            n = -n;

        System.out.println("その絶対値は" + n + "です");
    }
}
