package Screen04Pra;

import java.util.Scanner;

public class En4no14 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n;
        do {
            System.out.print("正の整数値:");
            n = stdIn.nextInt();
        } while (n <= 0);

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            if (i < n)
                System.out.print(" + ");
            else
                System.out.print(" = ");
            sum += i;
        }

        System.out.print(sum);
        System.out.println();
    }
}
