package Screen02;

import java.util.Scanner;

public class Circle2 {
    public static void main(String[] args) {
        // 円周の長さと円の面積を求める(その2:円周率をfinal変数で表す)

        // final変数は後から値を変えることができない
        // final変数は基本的に大文字で記載することがセオリー(違いがわかるため)
        final double PI = 3.1416;
        Scanner stdIn = new Scanner(System.in);

        System.out.print("半径:");
        double r = stdIn.nextDouble();

        System.out.println("円周の長さは" + 2 * PI * r + "です");
        System.out.println("面積は" + PI * r * r + "です");
    }
}
