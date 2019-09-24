package Screen02;

import java.util.Scanner;

public class Minus {
    public static void main(String[] args) {
        // 単項符号演算子を利用して読み込んだ値を負の値にする

        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数値:");
        int a = stdIn.nextInt();

        int b = -a;
        System.out.println(a + "の符号を反転した値は" + b + "です");
    }
}
