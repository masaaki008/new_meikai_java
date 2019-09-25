package Screen04Pra;

import java.util.Scanner;

public class En4no4 {
    public static void main(String[] args) {
        // 正の整数値を0までカウントダウン
        Scanner stdIn = new Scanner(System.in);

        System.out.println("カウントダウンをします");
        int x;
        do {
            System.out.print("正の整数値:");
            x = stdIn.nextInt();
        } while (x <= 0);

        while (x >= 0) {
            System.out.println(x);
            x--;
        }

        System.out.println("x:" + x);
    }
}
