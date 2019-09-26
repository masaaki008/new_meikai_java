package Screen04;

import java.util.Scanner;

// List4-16
public class IsoscelesTriangle {
    public static void main(String[] args) {
        // 左下側が直角の三角形を表示
        Scanner stdIn = new Scanner(System.in);

        System.out.println("左下直角の三角形を表示します");
        System.out.print("段数は:");
        int n = stdIn.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print('*');
            System.out.println();
        }
    }
}
