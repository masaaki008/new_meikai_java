package Screen03;

import java.util.Scanner;

public class PositiveNot {
    public static void main(String[] args) {
        // 読み込んだ値は正の値か/そうでないか?
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数値:");
        int n = stdIn.nextInt();

        if (n > 0)
            System.out.println("その値は正の値です");
        else
            System.out.println("その値は0か負の値です");
    }
}
