package Screen02;

import java.util.Scanner;

public class HelloNextLine {
    public static void main(String[] args) {
        // 名前を読み込んで表示
        Scanner stdIn = new Scanner(System.in);

        System.out.print("What your name?:");
        // nextLineメソッドを使用することで一行分の入力を読み込む
        String s = stdIn.nextLine();

        System.out.println("Hello " + s);
    }
}
