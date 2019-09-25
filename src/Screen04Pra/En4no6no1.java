package Screen04Pra;

import java.util.Scanner;

public class En4no6no1 {
    public static void main(String[] args) {
        // 読み込んだ個数だけ*を表示
        Scanner stdIn = new Scanner(System.in);

        System.out.print("何個*を表示しますか:");
        int n = stdIn.nextInt();

        int i = 0;
        while (i < n) {
            System.out.print('*');
            i++;
        }

        if (i != 0)
            System.out.println();
    }
}
