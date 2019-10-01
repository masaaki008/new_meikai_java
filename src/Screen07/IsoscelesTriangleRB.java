package Screen07;

import java.util.Scanner;

// List7-8
// 右下が直角の直角三角形
public class IsoscelesTriangleRB {
    static void putChars(char c, int n) {
        while (n-- > 0)
            System.out.print(c);
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("右下直角の三角形を表示します");
        System.out.print("段数:");
        int n = stdIn.nextInt();

        for (int i = 1; i <= n; i++) {
            putChars(' ', n - i);
            putChars('+', i);
            System.out.println();
        }
    }
}
