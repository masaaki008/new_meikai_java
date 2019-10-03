package Screen07;

import java.util.Scanner;

// List7-12
// int型整数のビット単位の論理積・論理和・排他的論理和・補数を表示
public class BitwiseOperation {
    static void printBists(int x) {
        for (int i = 31; i >= 0; i--)
            System.out.print(((x >>> i & 1) == 1)? '1' : '0');
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("2つの整数を入力してください");
        System.out.print("a : "); int a = stdIn.nextInt();
        System.out.print("b : "); int b = stdIn.nextInt();

        System.out.print(  "a     = "); printBists(a);
        System.out.print("\nb     =");  printBists(b);
        System.out.print("\na & b = "); printBists(a & b);
        System.out.print("\na | b = "); printBists(a | b);
        System.out.print("\na - b = "); printBists(a - b);
        System.out.print("\n-a    = "); printBists(-a);
        System.out.print("\n-b    = "); printBists(-b);
    }
}
