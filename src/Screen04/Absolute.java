package Screen04;

import java.util.Scanner;

// List4C-1
public class Absolute {
    public static void main(String[] args) {
        // 負の整数の絶対値を求める(ラベル付きbreak文)
        // ラベルがあれば繰り返し文ではなくてもbreakが使える
        Scanner stdIn = new Scanner(System.in);

        a: {
            System.out.print("負の整数:");
            int t = stdIn.nextInt();
            if (t >= 0) break a;
            t = -t;
            System.out.println("絶対値は" + t);
        }
    }
}
