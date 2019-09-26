package Screen04Pra;

import java.util.Scanner;

public class En4no21no2 {
    public static void main(String[] args) {
        // 直角が右下側の三角形を表示
        Scanner stdIn = new Scanner(System.in);

        int n;
        do {
            System.out.print("n段:");
            n = stdIn.nextInt();
        } while (n <= 0);

        for (int i = 1; i <= n; i++) {
            for (int j = n - 1; j >= 0; j--) {
                if (j < i) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}
