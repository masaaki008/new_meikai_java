package Screen04;

import java.util.Scanner;

public class PutAsteriskFor {
    public static void main(String[] args) {
        // 読み込んだ個数だけ*を表示
        Scanner stdIn = new Scanner(System.in);

        System.out.print("何個*を表示しますか:");
        int n = stdIn.nextInt();

        for (int i = 0; i < n; i++)
            System.out.print('*');
        System.out.println();
    }
}
