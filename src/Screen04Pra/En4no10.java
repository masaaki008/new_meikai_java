package Screen04Pra;

import java.util.Scanner;

public class En4no10 {
    public static void main(String[] args) {
        // 読み込んだ個数だけ*を表示
        Scanner stdIn = new Scanner(System.in);

        System.out.print("何個*を表示しますか:");
        int n = stdIn.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print('*');
            if (i == n)
                System.out.println();
        }
    }
}
