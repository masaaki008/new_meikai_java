package Screen07;

import java.util.Scanner;

// List7-7
// 左下が直角の直角三角形を表示
public class IsoscelesTriangleLB {
    static void putStars(int n) {
        while (n-- > 0)
            System.out.print('*');
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("左下直角三角形を表示します");
        System.out.print("段数は:");
        int n = stdIn.nextInt();

        for (int i = 1; i <= n; i++) {
            putStars(i);
            System.out.println();
        }
    }
}
