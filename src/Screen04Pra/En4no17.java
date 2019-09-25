package Screen04Pra;

import java.util.Scanner;

public class En4no17 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数値:");
        int n = stdIn.nextInt();

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                count += 1;
            }
        }
        System.out.println("約数は" + count + "個です");
    }
}
