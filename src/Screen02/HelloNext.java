package Screen02;

import java.util.Scanner;

public class HelloNext {
    public static void main(String[] args) {
        // 名前を読み込んで表示する
        Scanner stdIn = new Scanner(System.in);

        System.out.print("What your name?:");
        // nextメソッドだと空白やタブは読み込まない
        String s = stdIn.next();

        System.out.println("Hello " + s);
    }
}
