package Screen05Pra;

import java.util.Scanner;

public class En5no1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数:");
        int n = stdIn.nextInt();

        System.out.printf(" 8進数: %o\n", n);
        System.out.printf("16進数: %x\n", n);
    }
}
