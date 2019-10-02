package Screen07Pra;

import java.util.Scanner;

public class En7no9 {
    static Scanner stdIn = new Scanner(System.in);

    static int readPlusInt() {
        int n;
        do {
            System.out.print("正の整数値:");
            n = stdIn.nextInt();
        } while (n <= 0);

        return n;
    }

    public static void main(String[] args) {
        int a = readPlusInt();
        System.out.println(a);
    }
}
