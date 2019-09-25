package Screen04Pra;

import java.util.Scanner;

public class En4no8 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n;
        do {
            System.out.print("正の整数値:");
            n = stdIn.nextInt();
        } while (n <= 0);

        int count = 1;
        while (n / 10 != 0) {
            count += 1;
            n /= 10;
        }

        System.out.println("桁数:" + count);
    }
}
