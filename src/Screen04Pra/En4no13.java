package Screen04Pra;

import java.util.Scanner;

public class En4no13 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n;
        do {
            System.out.print("正の整数値:");
            n = stdIn.nextInt();
        } while (n <= 0);

        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum += i;

        System.out.println("sum:" + sum);
    }
}
