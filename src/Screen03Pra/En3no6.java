package Screen03Pra;

import java.util.Scanner;

public class En3no6 {
    public static void main(String[] args) {
        // 正の値を読み込んで10の倍数かを確認
        // 0または負が入力されたらエラーを表示
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数値:"); int n = stdIn.nextInt();

        if (n > 0)
            if (n % 10 == 0)
                System.out.println("その値は10の倍数です");
            else
                System.out.println("その値は10の倍数ではありません");
        else
            System.out.println("正ではない値が入力されました");
    }
}
