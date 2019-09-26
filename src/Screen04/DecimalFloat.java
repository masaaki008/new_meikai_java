package Screen04;

import java.util.Scanner;

// List4-25
public class DecimalFloat {
    public static void main(String[] args) {
        // 整数値と実数値を読み込んで表示
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数x:");
        int x = stdIn.nextInt();

        System.out.print("実数y:");
        double y = stdIn.nextDouble();

        System.out.printf("x=%3d y=%6.2f\n", x, y);
    }
}
