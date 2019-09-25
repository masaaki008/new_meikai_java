package Screen03Pra;

import java.util.Scanner;

public class En3no7 {
    public static void main(String[] args) {
        // 正の整数値を読み込んで3で割れるか、あまりはいくつかを表示する
        // 入力された値が0か負であればエラーを表示する
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数値:"); int n = stdIn.nextInt();

        if (n > 0)
            if (n % 3 == 0)
                System.out.println("その値は3で割り切れます");
            else
                System.out.println("その値を3で割った余りは" + (n % 3) + "です");
        else
            System.out.println("正ではない値が入力されました");
    }
}
