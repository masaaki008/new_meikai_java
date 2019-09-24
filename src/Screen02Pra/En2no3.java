package Screen02Pra;

import java.util.Scanner;

public class En2no3 {
    public static void main(String[] args) {
        // 入力した値をそのまま出力する

        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数値:");
        int x = stdIn.nextInt();

        System.out.println(x + "と入力されました");
    }
}
