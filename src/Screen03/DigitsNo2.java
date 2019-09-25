package Screen03;

import java.util.Scanner;

public class DigitsNo2 {
    public static void main(String[] args) {
        // 読み込んだ整数値が2桁以上か判定
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数値:"); int n = stdIn.nextInt();

        if (n <= -10 || n >= 10)
            System.out.println("2桁以上です");
        else
            System.out.println("2桁未満です");
    }
}
