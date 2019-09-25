package Screen04;

import java.util.Scanner;

public class Measure {
    public static void main(String[] args) {
        // 読み込んだ整数値のすべての約数を表示
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数値:");
        int n = stdIn.nextInt();

        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                System.out.println(i);
    }
}
