package Screen07Pra;

import java.util.Scanner;

public class En7no12 {
    static void printBits(int x) {
        for (int i = 31; i >= 0; i--)
            System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
    }

    static int rRotate(int x, int n) {
        if (n < 0) return lRotate(x, -n);
        n %= 32;
        return (n == 0 ? x : (x >>> n) | (x << (32 - n)));
    }

    static int lRotate(int x, int n) {
        if (n < 0) return rRotate(x, -n);
        n %= 32;
        return (n == 0 ? x : (x << n) | (x >>> (32 - n)));
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("整数xをnビット回転します");
        System.out.print("x:"); int x = stdIn.nextInt();
        System.out.print("n:"); int n = stdIn.nextInt();

        System.out.print("回転前 = "); printBits(x);
        System.out.print("\n右回転 = "); printBits(rRotate(x, n));
        System.out.print("\n左回転 = "); printBits(lRotate(x, n));
        System.out.println();
    }
}
