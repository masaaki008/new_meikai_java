package Screen04Pra;

import java.util.Scanner;

public class En4no24 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n;
        do {
            System.out.print("正の整数:");
            n = stdIn.nextInt();
        } while (n <= 0);

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("素数ではありません");
                break;
            }

            if (i + 1 == n)
                System.out.println(n + "は素数です");
        }
    }
}
