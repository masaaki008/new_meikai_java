package Screen04Pra;

import java.util.Scanner;

public class En4no16 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("何個*を表示しますか:");
        int n = stdIn.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0) {
                System.out.print('*');
                System.out.println();
            } else {
                System.out.print('*');
            }
        }
        System.out.println();
    }
}
