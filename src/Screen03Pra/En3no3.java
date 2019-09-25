package Screen03Pra;

import java.util.Scanner;

public class En3no3 {
    public static void main(String[] args) {
        // 読み込んだ整数値の符号を判定して表示
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数値:");
        int n = stdIn.nextInt();

        if (n > 0)
            System.out.println("その値は正です");
        else if (n < 0)
            System.out.println("その値は負です");
        else if (n == 0)
            System.out.println("その値は0です");
    }
}
