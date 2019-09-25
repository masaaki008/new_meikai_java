package Screen03;

import java.util.Scanner;

public class FingerFlashing1 {
    public static void main(String[] args) {
        // 読み込んだ値に応じてじゃんけんの手を表示
        Scanner stdIn = new Scanner(System.in);

        System.out.print("手を選べ(0.グー/1.チョキ/2.パー):");
        int hand = stdIn.nextInt();

        if (hand == 0)
            System.out.println("グー");
        else if (hand == 1)
            System.out.println("チョキ");
        else if (hand == 2)
            System.out.println("パー");
    }
}
