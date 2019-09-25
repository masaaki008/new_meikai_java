package Screen04Pra;

import java.util.Scanner;

public class En4no1 {
    public static void main(String[] args) {
        // 読み込んだ値の符号を判定して表示
        Scanner stdIn = new Scanner(System.in);

        int retry;

        do {
            System.out.print("整数値:");
            int n = stdIn.nextInt();

            if (n > 0)
                System.out.println("正です");
            else if (n < 0)
                System.out.println("負です");
            else
                System.out.println("0です");

            System.out.print("もう一度?1.Yes/0.No:");
            retry = stdIn.nextInt();

        } while (retry == 1);
    }
}
