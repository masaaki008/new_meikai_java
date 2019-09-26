package Screen04;

import java.util.Scanner;

// List4-17
public class SumBreak1 {
    public static void main(String[] args) {
        // 読み込んだ整数を加算(0が入力されたら終了)
        Scanner stdIn = new Scanner(System.in);

        System.out.println("整数を加算します");
        System.out.print("何個加算しますか:");
        int n = stdIn.nextInt();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("整数(0で終了):");
            int t = stdIn.nextInt();
            if (t == 0) break;
            sum += t;
        }
        System.out.println("合計は" + sum);
    }
}
