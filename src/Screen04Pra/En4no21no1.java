package Screen04Pra;

import java.util.Scanner;

public class En4no21no1 {
    public static void main(String[] args) {
        // 直角が左上側の三角形を表示
        Scanner stdIn = new Scanner(System.in);

        int n;
        do {
            System.out.print("n段:");
            n = stdIn.nextInt();
        } while (n <= 0);

        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
