package Screen04Pra;

import java.util.Scanner;

public class En4no20 {
    public static void main(String[] args) {
        // n段の正方形を表示

        Scanner stdIn = new Scanner(System.in);

        int n;
        do {
            System.out.print("n段:");
            n = stdIn.nextInt();
        } while (n <= 0);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
