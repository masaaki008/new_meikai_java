package Screen03;

import java.util.Scanner;

public class DigitsNo1 {
    public static void main(String[] args) {
        // 読み込んだ整数値の桁数を判定
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数値:"); int n = stdIn.nextInt();

        if (n == 0)
            System.out.println("0です");
        else if (n >= -9 && n <= 9)
            System.out.println("1桁です");
        else
            System.out.println("2桁以上です");
    }
}
