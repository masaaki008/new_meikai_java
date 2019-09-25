package Screen03Pra;

import java.util.Scanner;

public class En3no5 {
    public static void main(String[] args) {
        // 正の整数値を読み込んで5で割り切れるかを表示
        // 0または負が入力されたらエラーを表示
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数値:"); int n = stdIn.nextInt();

        if (n > 0)
            if (n % 5 == 0)
                System.out.println("その値は5で割り切れます");
            else
                System.out.println("その値は5で割り切れません");
        else
            System.out.println("正ではない値が入力されました");
    }
}
