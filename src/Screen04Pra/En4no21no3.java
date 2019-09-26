package Screen04Pra;

import java.util.Scanner;

public class En4no21no3 {
    public static void main(String[] args) {
        // 右上側が直角な三角形を表示
        Scanner stdIn = new Scanner(System.in);

        int n;
        do {
            System.out.print("n段:");
            n = stdIn.nextInt();
        } while (n <= 0);

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n; j++) {
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
