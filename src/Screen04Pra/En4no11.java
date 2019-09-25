package Screen04Pra;

import java.util.Scanner;

public class En4no11 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n;
        do {
            System.out.print("正の整数値:");
            n = stdIn.nextInt();
        } while (n <= 0);

        for (int i = n; i >= 0; i--)
            System.out.println(i);
    }
}
