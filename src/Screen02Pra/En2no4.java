package Screen02Pra;

import java.util.Scanner;

public class En2no4 {
    public static void main(String[] args) {
        // 入力された値に10乗減した値を出力

        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数値:");
        int x = stdIn.nextInt();

        System.out.println("10加えた値は" + (x + 10));
        System.out.println("10減らした値は" + (x - 10));
    }
}
