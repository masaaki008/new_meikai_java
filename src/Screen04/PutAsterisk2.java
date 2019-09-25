package Screen04;

import java.util.Scanner;

public class PutAsterisk2 {
    public static void main(String[] args) {
        // 読み込んだ個数だけ*を表示
        Scanner stdIn = new Scanner(System.in);

        System.out.print("何個*を表示しますか:");
        int n = stdIn.nextInt();

        int i = 1;
        while (i <= n) {
            System.out.print('*');
            i++;
        }
        System.out.println();
    }
}
