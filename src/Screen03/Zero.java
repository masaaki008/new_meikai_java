package Screen03;

import java.util.Scanner;

public class Zero {
    public static void main(String[] args) {
        // 読み込んだ整数値は0であるかどうか
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数値:");
        int n = stdIn.nextInt();

        if (!(n != 0))
            System.out.println("その値は0です");
        else
            System.out.println("その値は0ではありません");
    }
}
